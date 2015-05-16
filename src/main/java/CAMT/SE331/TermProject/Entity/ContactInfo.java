package CAMT.SE331.TermProject.Entity;

/**
 * Created by Pktaro on 5/3/2015.
 */
public class ContactInfo {
    String googleMapLink;
    String address;
    String tel;
    String facebookLink;

    public ContactInfo(String googleMapLink, String address, String tel, String facebookLink) {
        this.googleMapLink = googleMapLink;
        this.address = address;
        this.tel = tel;
        this.facebookLink = facebookLink;
    }

    public String getGoogleMapLink() {
        return googleMapLink;
    }

    public void setGoogleMapLink(String googleMapLink) {
        this.googleMapLink = googleMapLink;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFacebookLink() {
        return facebookLink;
    }

    public void setFacebookLink(String facebookLink) {
        this.facebookLink = facebookLink;
    }
}
