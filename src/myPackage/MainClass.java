package myPackage;

import org.json.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.naming.ServiceUnavailableException;

import com.microsoft.aad.adal4j.AuthenticationContext;
import com.microsoft.aad.adal4j.AuthenticationResult;
import com.microsoft.aad.adal4jsample.HttpClientHelper;
import com.microsoft.aad.adal4jsample.JSONHelper;
import com.microsoft.aad.adal4jsample.User;
import com.microsoft.aad.adal4jsample.*;


/*
 * This sample integrates Office 365 and Azure AD in Java code. 
 * It uses ADAL library to auth with Azure Active Directory of an Office 365 Tenant.
 * To use you need first to create a Native Client App in Azure AD: https://msdn.microsoft.com/library/azure/dn132599.aspx#BKMK_Adding ,
 * and give permission for Office 365 operation you want to perform (Read user email in this sample).
 * An example on where to set permission can be found here: https://github.com/OfficeDev/O365-Android-Connect/wiki/Grant-permissions-to-the-Connect-application-in-Azure 
 * The Java code:
 * Acquires the Access Token try to use the Graph API to get some sample values. 
 * Acquires the Access Token to use Office 365 API to read some messages from the user account. 
 * */
public class MainClass {
	
	private final static String AUTHORITY = "https://login.windows.net/common"; 
	private static String CLIENT_ID = "<guid>";
	private static String TENANT = "<yourdomani>.onmicrosoft.com";
	private static String USERNAME = "<user>@<yourdomani>.onmicrosoft.com";
	private static String PASSWORD = "<password>";


	public static void main(String[] args) throws Exception {
		
		// Get your data from main args for this sample code
		TENANT = args[0];
		USERNAME = args[1];
		PASSWORD =  args[2];
		CLIENT_ID =  args[3];
				
		System.out.println("Calling...");
		
		try{
			
			System.out.println("Getting Access Token for Graph API..." );
			
			// Working with Graph API
			AuthenticationResult result = getAccessTokenFromUserCredentials(
            		"https://graph.windows.net",
            		USERNAME,PASSWORD
                    );
			
			System.out.println("Access Token - " + result.getAccessToken());
            System.out.println("Refresh Token - " + result.getRefreshToken());
            
			String username = getUsernamesFromGraph(result.getAccessToken(), TENANT);
            System.out.println("Usernames:\n" + username);
            
            System.out.println("Getting Access Token for Outlook (Office 365) API..." );
            
            // Working with Office 365 API
            result = getAccessTokenFromUserCredentials(
            		"https://outlook.office365.com",
            		USERNAME,PASSWORD
                    );
            
            System.out.println("Access Token - " + result.getAccessToken());
            System.out.println("Refresh Token - " + result.getRefreshToken());
            
            String messages =  getMessages(result.getAccessToken());
            
            System.out.println("Some mail messages (subjects):\n" + messages);
            System.out.println("Done.");
        }
		catch(Exception e){
			System.out.println("Error: - " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	private static AuthenticationResult getAccessTokenFromUserCredentials(String serviceURL,
            String username, String password) throws Exception {
        AuthenticationContext context = null;
        AuthenticationResult result = null;
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(1);
            context = new AuthenticationContext(AUTHORITY, false, service);
            Future<AuthenticationResult> future = context.acquireToken(
            		serviceURL, CLIENT_ID, username, password,
                    null);
            result = future.get();
        } finally {
            service.shutdown();
        }

        if (result == null) {
            throw new ServiceUnavailableException(
                    "authentication result was null");
        }
        return result;

	}
	
	private static String getUsernamesFromGraph(String accessToken, String tenant) throws Exception {
        URL url = new URL(String.format("https://graph.windows.net/%s/users?api-version=1.5", tenant,
                accessToken));

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        // Set the appropriate header fields in the request header.
        conn.setRequestProperty("api-version", "1.5");
        conn.setRequestProperty("Authorization", accessToken);
        conn.setRequestProperty("Accept", "application/json;odata=minimalmetadata");
        String goodRespStr = HttpClientHelper.getResponseStringFromConn(conn, true);
        
        int responseCode = conn.getResponseCode();
        JSONObject response = HttpClientHelper.processGoodRespStr(responseCode, goodRespStr);
        JSONArray users = new JSONArray();

        users = JSONHelper.fetchDirectoryObjectJSONArray(response);

        StringBuilder builder = new StringBuilder();
        User user = null;
        for (int i = 0; i < users.length(); i++) {
            JSONObject thisUserJSONObject = users.optJSONObject(i);
            user = new User();
            JSONHelper.convertJSONObjectToDirectoryObject(thisUserJSONObject, user);
            builder.append(user.getUserPrincipalName() + "\n");
        }
        return builder.toString();
    }
	
	private static String getMessages(String accessToken) throws Exception {
        URL url = new URL(String.format("https://outlook.office365.com/api/v1.0/me/folders/inbox/messages?$top=3",
                accessToken));

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        // Set the appropriate header fields in the request header.
        conn.setRequestProperty("Authorization", "Bearer " + accessToken);
        conn.setRequestProperty("Accept", "application/json;odata.metadata=full");
        String goodRespStr = HttpClientHelper.getResponseStringFromConn(conn, true);
        
        int responseCode = conn.getResponseCode();
        JSONObject response = HttpClientHelper.processGoodRespStr(responseCode, goodRespStr);
        JSONArray messages = new JSONArray();

        messages = JSONHelper.fetchDirectoryObjectJSONArray(response);

        MailMessage  mail =  null;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < messages.length(); i++) {
            JSONObject thisJSONObject = messages.optJSONObject(i);
            mail = new MailMessage();
            JSONHelper.convertJSONObjectToDirectoryObject(thisJSONObject, mail);
            builder.append(mail.getSubject() + "\n");
        }
        return builder.toString();
    }

}
