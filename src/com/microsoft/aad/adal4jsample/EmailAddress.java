package com.microsoft.aad.adal4jsample;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class EmailAddress {

@Expose
private String Address;
@SerializedName("@odata.type")
@Expose
private String OdataType;
@Expose
private String Name;

/**
* 
* @return
* The Address
*/
public String getAddress() {
return Address;
}

/**
* 
* @param Address
* The Address
*/
public void setAddress(String Address) {
this.Address = Address;
}

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
* The Name
*/
public String getName() {
return Name;
}

/**
* 
* @param Name
* The Name
*/
public void setName(String Name) {
this.Name = Name;
}

}

