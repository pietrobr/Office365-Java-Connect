package com.microsoft.aad.adal4jsample;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class MicrosoftOutlookServicesCopy {

@Expose
private String title;
@Expose
private String target;

/**
* 
* @return
* The title
*/
public String getTitle() {
return title;
}

/**
* 
* @param title
* The title
*/
public void setTitle(String title) {
this.title = title;
}

/**
* 
* @return
* The target
*/
public String getTarget() {
return target;
}

/**
* 
* @param target
* The target
*/
public void setTarget(String target) {
this.target = target;
}

}