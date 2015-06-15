package com.microsoft.aad.adal4jsample;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class From {

@SerializedName("@odata.type")
@Expose
private String OdataType;
@Expose
private EmailAddress__ EmailAddress;

/**
* 
* @return
* The OdataType
*/
public String getOdataType() {
return OdataType;
}

/**
* 
* @param OdataType
* The @odata.type
*/
public void setOdataType(String OdataType) {
this.OdataType = OdataType;
}

/**
* 
* @return
* The EmailAddress
*/
public EmailAddress__ getEmailAddress() {
return EmailAddress;
}

/**
* 
* @param EmailAddress
* The EmailAddress
*/
public void setEmailAddress(EmailAddress__ EmailAddress) {
this.EmailAddress = EmailAddress;
}

}