package com.microsoft.aad.adal4jsample;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Sender {

@SerializedName("@odata.type")
@Expose
private String OdataType;
@Expose
private com.microsoft.aad.adal4jsample.EmailAddress EmailAddress;

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
public com.microsoft.aad.adal4jsample.EmailAddress getEmailAddress() {
return EmailAddress;
}

/**
* 
* @param EmailAddress
* The EmailAddress
*/
public void setEmailAddress(com.microsoft.aad.adal4jsample.EmailAddress EmailAddress) {
this.EmailAddress = EmailAddress;
}

}