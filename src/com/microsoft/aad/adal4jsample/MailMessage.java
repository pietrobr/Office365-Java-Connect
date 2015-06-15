package com.microsoft.aad.adal4jsample;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.microsoft.aad.adal4jsample.ToRecipient;

@Generated("org.jsonschema2pojo")
public class MailMessage {

@SerializedName("@odata.type")
@Expose
private String OdataType;
@SerializedName("DateTimeLastModified@odata.type")
@Expose
private String DateTimeLastModifiedOdataType;
@SerializedName("ReplyTo@odata.type")
@Expose
private String ReplyToOdataType;
@SerializedName("#Microsoft.OutlookServices.Move")
@Expose
private com.microsoft.aad.adal4jsample.MicrosoftOutlookServicesMove MicrosoftOutlookServicesMove;
@Expose
private Boolean IsRead;
@Expose
private String Importance;
@Expose
private List<Object> ReplyTo = new ArrayList<Object>();
@SerializedName("@odata.id")
@Expose
private String OdataId;
@Expose
private List<Object> CcRecipients = new ArrayList<Object>();
@Expose
private String BodyPreview;
@SerializedName("DateTimeReceived@odata.type")
@Expose
private String DateTimeReceivedOdataType;
@Expose
private Boolean IsDraft;
@SerializedName("@odata.editLink")
@Expose
private String OdataEditLink;
@Expose
private List<Object> Categories = new ArrayList<Object>();
@SerializedName("@odata.etag")
@Expose
private String OdataEtag;
@Expose
private String DateTimeReceived;
@SerializedName("DateTimeCreated@odata.type")
@Expose
private String DateTimeCreatedOdataType;
@Expose
private String ParentFolderId;
@Expose
private com.microsoft.aad.adal4jsample.Sender Sender;
@Expose
private Boolean IsDeliveryReceiptRequested;
@SerializedName("ToRecipients@odata.type")
@Expose
private String ToRecipientsOdataType;
@Expose
private List<Object> BccRecipients = new ArrayList<Object>();
@SerializedName("#Microsoft.OutlookServices.Reply")
@Expose
private com.microsoft.aad.adal4jsample.MicrosoftOutlookServicesReply MicrosoftOutlookServicesReply;
@SerializedName("Attachments@odata.navigationLink")
@Expose
private String AttachmentsOdataNavigationLink;
@Expose
private String Id;
@Expose
private String ChangeKey;
@SerializedName("#Microsoft.OutlookServices.CreateForward")
@Expose
private com.microsoft.aad.adal4jsample.MicrosoftOutlookServicesCreateForward MicrosoftOutlookServicesCreateForward;
@Expose
private String ConversationId;
@SerializedName("BccRecipients@odata.type")
@Expose
private String BccRecipientsOdataType;
@SerializedName("CcRecipients@odata.type")
@Expose
private String CcRecipientsOdataType;
@SerializedName("#Microsoft.OutlookServices.Send")
@Expose
private com.microsoft.aad.adal4jsample.MicrosoftOutlookServicesSend MicrosoftOutlookServicesSend;
@Expose
private String DateTimeSent;
@SerializedName("#Microsoft.OutlookServices.ReplyAll")
@Expose
private com.microsoft.aad.adal4jsample.MicrosoftOutlookServicesReplyAll MicrosoftOutlookServicesReplyAll;
@Expose
private String DateTimeCreated;
@Expose
private com.microsoft.aad.adal4jsample.Body Body;
@SerializedName("Attachments@odata.associationLink")
@Expose
private String AttachmentsOdataAssociationLink;
@SerializedName("DateTimeSent@odata.type")
@Expose
private String DateTimeSentOdataType;
@Expose
private Boolean HasAttachments;
@Expose
private List<ToRecipient> ToRecipients = new ArrayList<ToRecipient>();
@SerializedName("#Microsoft.OutlookServices.CreateReplyAll")
@Expose
private com.microsoft.aad.adal4jsample.MicrosoftOutlookServicesCreateReplyAll MicrosoftOutlookServicesCreateReplyAll;
@Expose
private com.microsoft.aad.adal4jsample.From From;
@Expose
private String DateTimeLastModified;
@SerializedName("#Microsoft.OutlookServices.Copy")
@Expose
private com.microsoft.aad.adal4jsample.MicrosoftOutlookServicesCopy MicrosoftOutlookServicesCopy;
@Expose
private String Subject;
@Expose
private String WebLink;
@SerializedName("#Microsoft.OutlookServices.CreateReply")
@Expose
private com.microsoft.aad.adal4jsample.MicrosoftOutlookServicesCreateReply MicrosoftOutlookServicesCreateReply;
@SerializedName("Categories@odata.type")
@Expose
private String CategoriesOdataType;
@Expose
private Boolean IsReadReceiptRequested;
@SerializedName("#Microsoft.OutlookServices.Forward")
@Expose
private com.microsoft.aad.adal4jsample.MicrosoftOutlookServicesForward MicrosoftOutlookServicesForward;

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
* The DateTimeLastModifiedOdataType
*/
public String getDateTimeLastModifiedOdataType() {
return DateTimeLastModifiedOdataType;
}

/**
* 
* @param DateTimeLastModifiedOdataType
* The DateTimeLastModified@odata.type
*/
public void setDateTimeLastModifiedOdataType(String DateTimeLastModifiedOdataType) {
this.DateTimeLastModifiedOdataType = DateTimeLastModifiedOdataType;
}

/**
* 
* @return
* The ReplyToOdataType
*/
public String getReplyToOdataType() {
return ReplyToOdataType;
}

/**
* 
* @param ReplyToOdataType
* The ReplyTo@odata.type
*/
public void setReplyToOdataType(String ReplyToOdataType) {
this.ReplyToOdataType = ReplyToOdataType;
}

/**
* 
* @return
* The MicrosoftOutlookServicesMove
*/
public com.microsoft.aad.adal4jsample.MicrosoftOutlookServicesMove getMicrosoftOutlookServicesMove() {
return MicrosoftOutlookServicesMove;
}

/**
* 
* @param MicrosoftOutlookServicesMove
* The #Microsoft.OutlookServices.Move
*/
public void setMicrosoftOutlookServicesMove(com.microsoft.aad.adal4jsample.MicrosoftOutlookServicesMove MicrosoftOutlookServicesMove) {
this.MicrosoftOutlookServicesMove = MicrosoftOutlookServicesMove;
}

/**
* 
* @return
* The IsRead
*/
public Boolean getIsRead() {
return IsRead;
}

/**
* 
* @param IsRead
* The IsRead
*/
public void setIsRead(Boolean IsRead) {
this.IsRead = IsRead;
}

/**
* 
* @return
* The Importance
*/
public String getImportance() {
return Importance;
}

/**
* 
* @param Importance
* The Importance
*/
public void setImportance(String Importance) {
this.Importance = Importance;
}

/**
* 
* @return
* The ReplyTo
*/
public List<Object> getReplyTo() {
return ReplyTo;
}

/**
* 
* @param ReplyTo
* The ReplyTo
*/
public void setReplyTo(List<Object> ReplyTo) {
this.ReplyTo = ReplyTo;
}

/**
* 
* @return
* The OdataId
*/
public String getOdataId() {
return OdataId;
}

/**
* 
* @param OdataId
* The @odata.id
*/
public void setOdataId(String OdataId) {
this.OdataId = OdataId;
}

/**
* 
* @return
* The CcRecipients
*/
public List<Object> getCcRecipients() {
return CcRecipients;
}

/**
* 
* @param CcRecipients
* The CcRecipients
*/
public void setCcRecipients(List<Object> CcRecipients) {
this.CcRecipients = CcRecipients;
}

/**
* 
* @return
* The BodyPreview
*/
public String getBodyPreview() {
return BodyPreview;
}

/**
* 
* @param BodyPreview
* The BodyPreview
*/
public void setBodyPreview(String BodyPreview) {
this.BodyPreview = BodyPreview;
}

/**
* 
* @return
* The DateTimeReceivedOdataType
*/
public String getDateTimeReceivedOdataType() {
return DateTimeReceivedOdataType;
}

/**
* 
* @param DateTimeReceivedOdataType
* The DateTimeReceived@odata.type
*/
public void setDateTimeReceivedOdataType(String DateTimeReceivedOdataType) {
this.DateTimeReceivedOdataType = DateTimeReceivedOdataType;
}

/**
* 
* @return
* The IsDraft
*/
public Boolean getIsDraft() {
return IsDraft;
}

/**
* 
* @param IsDraft
* The IsDraft
*/
public void setIsDraft(Boolean IsDraft) {
this.IsDraft = IsDraft;
}

/**
* 
* @return
* The OdataEditLink
*/
public String getOdataEditLink() {
return OdataEditLink;
}

/**
* 
* @param OdataEditLink
* The @odata.editLink
*/
public void setOdataEditLink(String OdataEditLink) {
this.OdataEditLink = OdataEditLink;
}

/**
* 
* @return
* The Categories
*/
public List<Object> getCategories() {
return Categories;
}

/**
* 
* @param Categories
* The Categories
*/
public void setCategories(List<Object> Categories) {
this.Categories = Categories;
}

/**
* 
* @return
* The OdataEtag
*/
public String getOdataEtag() {
return OdataEtag;
}

/**
* 
* @param OdataEtag
* The @odata.etag
*/
public void setOdataEtag(String OdataEtag) {
this.OdataEtag = OdataEtag;
}

/**
* 
* @return
* The DateTimeReceived
*/
public String getDateTimeReceived() {
return DateTimeReceived;
}

/**
* 
* @param DateTimeReceived
* The DateTimeReceived
*/
public void setDateTimeReceived(String DateTimeReceived) {
this.DateTimeReceived = DateTimeReceived;
}

/**
* 
* @return
* The DateTimeCreatedOdataType
*/
public String getDateTimeCreatedOdataType() {
return DateTimeCreatedOdataType;
}

/**
* 
* @param DateTimeCreatedOdataType
* The DateTimeCreated@odata.type
*/
public void setDateTimeCreatedOdataType(String DateTimeCreatedOdataType) {
this.DateTimeCreatedOdataType = DateTimeCreatedOdataType;
}

/**
* 
* @return
* The ParentFolderId
*/
public String getParentFolderId() {
return ParentFolderId;
}

/**
* 
* @param ParentFolderId
* The ParentFolderId
*/
public void setParentFolderId(String ParentFolderId) {
this.ParentFolderId = ParentFolderId;
}

/**
* 
* @return
* The Sender
*/
public com.microsoft.aad.adal4jsample.Sender getSender() {
return Sender;
}

/**
* 
* @param Sender
* The Sender
*/
public void setSender(com.microsoft.aad.adal4jsample.Sender Sender) {
this.Sender = Sender;
}

/**
* 
* @return
* The IsDeliveryReceiptRequested
*/
public Boolean getIsDeliveryReceiptRequested() {
return IsDeliveryReceiptRequested;
}

/**
* 
* @param IsDeliveryReceiptRequested
* The IsDeliveryReceiptRequested
*/
public void setIsDeliveryReceiptRequested(Boolean IsDeliveryReceiptRequested) {
this.IsDeliveryReceiptRequested = IsDeliveryReceiptRequested;
}

/**
* 
* @return
* The ToRecipientsOdataType
*/
public String getToRecipientsOdataType() {
return ToRecipientsOdataType;
}

/**
* 
* @param ToRecipientsOdataType
* The ToRecipients@odata.type
*/
public void setToRecipientsOdataType(String ToRecipientsOdataType) {
this.ToRecipientsOdataType = ToRecipientsOdataType;
}

/**
* 
* @return
* The BccRecipients
*/
public List<Object> getBccRecipients() {
return BccRecipients;
}

/**
* 
* @param BccRecipients
* The BccRecipients
*/
public void setBccRecipients(List<Object> BccRecipients) {
this.BccRecipients = BccRecipients;
}

/**
* 
* @return
* The MicrosoftOutlookServicesReply
*/
public com.microsoft.aad.adal4jsample.MicrosoftOutlookServicesReply getMicrosoftOutlookServicesReply() {
return MicrosoftOutlookServicesReply;
}

/**
* 
* @param MicrosoftOutlookServicesReply
* The #Microsoft.OutlookServices.Reply
*/
public void setMicrosoftOutlookServicesReply(com.microsoft.aad.adal4jsample.MicrosoftOutlookServicesReply MicrosoftOutlookServicesReply) {
this.MicrosoftOutlookServicesReply = MicrosoftOutlookServicesReply;
}

/**
* 
* @return
* The AttachmentsOdataNavigationLink
*/
public String getAttachmentsOdataNavigationLink() {
return AttachmentsOdataNavigationLink;
}

/**
* 
* @param AttachmentsOdataNavigationLink
* The Attachments@odata.navigationLink
*/
public void setAttachmentsOdataNavigationLink(String AttachmentsOdataNavigationLink) {
this.AttachmentsOdataNavigationLink = AttachmentsOdataNavigationLink;
}

/**
* 
* @return
* The Id
*/
public String getId() {
return Id;
}

/**
* 
* @param Id
* The Id
*/
public void setId(String Id) {
this.Id = Id;
}

/**
* 
* @return
* The ChangeKey
*/
public String getChangeKey() {
return ChangeKey;
}

/**
* 
* @param ChangeKey
* The ChangeKey
*/
public void setChangeKey(String ChangeKey) {
this.ChangeKey = ChangeKey;
}

/**
* 
* @return
* The MicrosoftOutlookServicesCreateForward
*/
public com.microsoft.aad.adal4jsample.MicrosoftOutlookServicesCreateForward getMicrosoftOutlookServicesCreateForward() {
return MicrosoftOutlookServicesCreateForward;
}

/**
* 
* @param MicrosoftOutlookServicesCreateForward
* The #Microsoft.OutlookServices.CreateForward
*/
public void setMicrosoftOutlookServicesCreateForward(com.microsoft.aad.adal4jsample.MicrosoftOutlookServicesCreateForward MicrosoftOutlookServicesCreateForward) {
this.MicrosoftOutlookServicesCreateForward = MicrosoftOutlookServicesCreateForward;
}

/**
* 
* @return
* The ConversationId
*/
public String getConversationId() {
return ConversationId;
}

/**
* 
* @param ConversationId
* The ConversationId
*/
public void setConversationId(String ConversationId) {
this.ConversationId = ConversationId;
}

/**
* 
* @return
* The BccRecipientsOdataType
*/
public String getBccRecipientsOdataType() {
return BccRecipientsOdataType;
}

/**
* 
* @param BccRecipientsOdataType
* The BccRecipients@odata.type
*/
public void setBccRecipientsOdataType(String BccRecipientsOdataType) {
this.BccRecipientsOdataType = BccRecipientsOdataType;
}

/**
* 
* @return
* The CcRecipientsOdataType
*/
public String getCcRecipientsOdataType() {
return CcRecipientsOdataType;
}

/**
* 
* @param CcRecipientsOdataType
* The CcRecipients@odata.type
*/
public void setCcRecipientsOdataType(String CcRecipientsOdataType) {
this.CcRecipientsOdataType = CcRecipientsOdataType;
}

/**
* 
* @return
* The MicrosoftOutlookServicesSend
*/
public com.microsoft.aad.adal4jsample.MicrosoftOutlookServicesSend getMicrosoftOutlookServicesSend() {
return MicrosoftOutlookServicesSend;
}

/**
* 
* @param MicrosoftOutlookServicesSend
* The #Microsoft.OutlookServices.Send
*/
public void setMicrosoftOutlookServicesSend(com.microsoft.aad.adal4jsample.MicrosoftOutlookServicesSend MicrosoftOutlookServicesSend) {
this.MicrosoftOutlookServicesSend = MicrosoftOutlookServicesSend;
}

/**
* 
* @return
* The DateTimeSent
*/
public String getDateTimeSent() {
return DateTimeSent;
}

/**
* 
* @param DateTimeSent
* The DateTimeSent
*/
public void setDateTimeSent(String DateTimeSent) {
this.DateTimeSent = DateTimeSent;
}

/**
* 
* @return
* The MicrosoftOutlookServicesReplyAll
*/
public com.microsoft.aad.adal4jsample.MicrosoftOutlookServicesReplyAll getMicrosoftOutlookServicesReplyAll() {
return MicrosoftOutlookServicesReplyAll;
}

/**
* 
* @param MicrosoftOutlookServicesReplyAll
* The #Microsoft.OutlookServices.ReplyAll
*/
public void setMicrosoftOutlookServicesReplyAll(com.microsoft.aad.adal4jsample.MicrosoftOutlookServicesReplyAll MicrosoftOutlookServicesReplyAll) {
this.MicrosoftOutlookServicesReplyAll = MicrosoftOutlookServicesReplyAll;
}

/**
* 
* @return
* The DateTimeCreated
*/
public String getDateTimeCreated() {
return DateTimeCreated;
}

/**
* 
* @param DateTimeCreated
* The DateTimeCreated
*/
public void setDateTimeCreated(String DateTimeCreated) {
this.DateTimeCreated = DateTimeCreated;
}

/**
* 
* @return
* The Body
*/
public com.microsoft.aad.adal4jsample.Body getBody() {
return Body;
}

/**
* 
* @param Body
* The Body
*/
public void setBody(com.microsoft.aad.adal4jsample.Body Body) {
this.Body = Body;
}

/**
* 
* @return
* The AttachmentsOdataAssociationLink
*/
public String getAttachmentsOdataAssociationLink() {
return AttachmentsOdataAssociationLink;
}

/**
* 
* @param AttachmentsOdataAssociationLink
* The Attachments@odata.associationLink
*/
public void setAttachmentsOdataAssociationLink(String AttachmentsOdataAssociationLink) {
this.AttachmentsOdataAssociationLink = AttachmentsOdataAssociationLink;
}

/**
* 
* @return
* The DateTimeSentOdataType
*/
public String getDateTimeSentOdataType() {
return DateTimeSentOdataType;
}

/**
* 
* @param DateTimeSentOdataType
* The DateTimeSent@odata.type
*/
public void setDateTimeSentOdataType(String DateTimeSentOdataType) {
this.DateTimeSentOdataType = DateTimeSentOdataType;
}

/**
* 
* @return
* The HasAttachments
*/
public Boolean getHasAttachments() {
return HasAttachments;
}

/**
* 
* @param HasAttachments
* The HasAttachments
*/
public void setHasAttachments(Boolean HasAttachments) {
this.HasAttachments = HasAttachments;
}

/**
* 
* @return
* The ToRecipients
*/
public List<ToRecipient> getToRecipients() {
return ToRecipients;
}

/**
* 
* @param ToRecipients
* The ToRecipients
*/
public void setToRecipients(List<ToRecipient> ToRecipients) {
this.ToRecipients = ToRecipients;
}

/**
* 
* @return
* The MicrosoftOutlookServicesCreateReplyAll
*/
public com.microsoft.aad.adal4jsample.MicrosoftOutlookServicesCreateReplyAll getMicrosoftOutlookServicesCreateReplyAll() {
return MicrosoftOutlookServicesCreateReplyAll;
}

/**
* 
* @param MicrosoftOutlookServicesCreateReplyAll
* The #Microsoft.OutlookServices.CreateReplyAll
*/
public void setMicrosoftOutlookServicesCreateReplyAll(com.microsoft.aad.adal4jsample.MicrosoftOutlookServicesCreateReplyAll MicrosoftOutlookServicesCreateReplyAll) {
this.MicrosoftOutlookServicesCreateReplyAll = MicrosoftOutlookServicesCreateReplyAll;
}

/**
* 
* @return
* The From
*/
public com.microsoft.aad.adal4jsample.From getFrom() {
return From;
}

/**
* 
* @param From
* The From
*/
public void setFrom(com.microsoft.aad.adal4jsample.From From) {
this.From = From;
}

/**
* 
* @return
* The DateTimeLastModified
*/
public String getDateTimeLastModified() {
return DateTimeLastModified;
}

/**
* 
* @param DateTimeLastModified
* The DateTimeLastModified
*/
public void setDateTimeLastModified(String DateTimeLastModified) {
this.DateTimeLastModified = DateTimeLastModified;
}

/**
* 
* @return
* The MicrosoftOutlookServicesCopy
*/
public com.microsoft.aad.adal4jsample.MicrosoftOutlookServicesCopy getMicrosoftOutlookServicesCopy() {
return MicrosoftOutlookServicesCopy;
}

/**
* 
* @param MicrosoftOutlookServicesCopy
* The #Microsoft.OutlookServices.Copy
*/
public void setMicrosoftOutlookServicesCopy(com.microsoft.aad.adal4jsample.MicrosoftOutlookServicesCopy MicrosoftOutlookServicesCopy) {
this.MicrosoftOutlookServicesCopy = MicrosoftOutlookServicesCopy;
}

/**
* 
* @return
* The Subject
*/
public String getSubject() {
return Subject;
}

/**
* 
* @param Subject
* The Subject
*/
public void setSubject(String Subject) {
this.Subject = Subject;
}

/**
* 
* @return
* The WebLink
*/
public String getWebLink() {
return WebLink;
}

/**
* 
* @param WebLink
* The WebLink
*/
public void setWebLink(String WebLink) {
this.WebLink = WebLink;
}

/**
* 
* @return
* The MicrosoftOutlookServicesCreateReply
*/
public com.microsoft.aad.adal4jsample.MicrosoftOutlookServicesCreateReply getMicrosoftOutlookServicesCreateReply() {
return MicrosoftOutlookServicesCreateReply;
}

/**
* 
* @param MicrosoftOutlookServicesCreateReply
* The #Microsoft.OutlookServices.CreateReply
*/
public void setMicrosoftOutlookServicesCreateReply(com.microsoft.aad.adal4jsample.MicrosoftOutlookServicesCreateReply MicrosoftOutlookServicesCreateReply) {
this.MicrosoftOutlookServicesCreateReply = MicrosoftOutlookServicesCreateReply;
}

/**
* 
* @return
* The CategoriesOdataType
*/
public String getCategoriesOdataType() {
return CategoriesOdataType;
}

/**
* 
* @param CategoriesOdataType
* The Categories@odata.type
*/
public void setCategoriesOdataType(String CategoriesOdataType) {
this.CategoriesOdataType = CategoriesOdataType;
}

/**
* 
* @return
* The IsReadReceiptRequested
*/
public Boolean getIsReadReceiptRequested() {
return IsReadReceiptRequested;
}

/**
* 
* @param IsReadReceiptRequested
* The IsReadReceiptRequested
*/
public void setIsReadReceiptRequested(Boolean IsReadReceiptRequested) {
this.IsReadReceiptRequested = IsReadReceiptRequested;
}

/**
* 
* @return
* The MicrosoftOutlookServicesForward
*/
public com.microsoft.aad.adal4jsample.MicrosoftOutlookServicesForward getMicrosoftOutlookServicesForward() {
return MicrosoftOutlookServicesForward;
}

/**
* 
* @param MicrosoftOutlookServicesForward
* The #Microsoft.OutlookServices.Forward
*/
public void setMicrosoftOutlookServicesForward(com.microsoft.aad.adal4jsample.MicrosoftOutlookServicesForward MicrosoftOutlookServicesForward) {
this.MicrosoftOutlookServicesForward = MicrosoftOutlookServicesForward;
}

}