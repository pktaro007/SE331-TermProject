package CAMT.SE331.TermProject.Dao;

import CAMT.SE331.TermProject.Entity.ContactInfo;

/**
 * Created by Pktaro on 5/3/2015.
 */
public interface ContactInfoDao {
    ContactInfo getContactInfo();
    void editContactInfo(ContactInfo contactInfo);
}
