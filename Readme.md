# Office 365 and Java Integration Sample

This sample demostrate how to authenticate an Office 365 user from a Java application and calling some APIs. This samlpe uses the [ADAL Library] to get Auth Tokens and then use them to call specific API. In details, the sample does:

  - Create an Access and Refresh Token to call Azure AD Graph APIs.
  - Call the Azure AD Graph API to get a list of users registered in Azure AD.
  - Create an Access and Refresh Token to call Office 365 Outlook APIs.
  - Call the Office 365 Outlook APIs via REST and get a list of user's mail messages.
  - Create an Access and Refresh Token to call Office 365 File APIs.
  - Call the Office 365 File APIs via REST and get a list of user's OneDrive for business files.

To make this sample works you need to create a Azure AD Native application and autorize for the API you want to call.
You can add a [native client application] in Azure and [grant proper permissions] to it.

You also need an Office 365 Tenant for the Office 365 APIs. The ClientID and Tenant will be used as constants and must be added to the code.

If you are an Android developer you can look at the [O365 Android Connect] sample.

p.s.: sorry if this documentation it's not very exhaustive.

[ADAL Library]:https://github.com/AzureAD/azure-activedirectory-library-for-java
[native client application]:http://aka.ms/o365-android-connect-addapp
[grant proper permissions]:https://github.com/OfficeDev/O365-Android-Connect/wiki/Grant-permissions-to-the-Connect-application-in-Azure
[O365 Android Connect]:https://github.com/OfficeDev/O365-Android-Connect