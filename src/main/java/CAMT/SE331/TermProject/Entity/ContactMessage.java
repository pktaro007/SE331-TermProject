package CAMT.SE331.TermProject.Entity;

/**
 * Created by Pktaro on 5/3/2015.
 */
public class ContactMessage {
    int id;
    String status;
    String contactInfo;
    String reply;

    public ContactMessage(int id, String status, String contactInfo, String reply) {
        this.id = id;
        this.status = status;
        this.contactInfo = contactInfo;
        this.reply = reply;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }
}
