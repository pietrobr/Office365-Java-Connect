package com.microsoft.aad.adal4jsample;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Body {

@Expose
private String ContentType;
@SerializedName("@odata.type")
@Expose
private String OdataType;
@Expose
private String Content;

/**
* 
* @return
* The ContentType
*/
public String getContentType() {
return ContentType;
}

/**
* 
* @param ContentType
* The ContentType
*/
public void setContentType(String ContentType) {
this.ContentType = ContentType;
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
* The Content
*/
public String getContent() {
return Content;
}

/**
* 
* @param Content
* The Content
*/
public void setContent(String Content) {
this.Content = Content;
}

}