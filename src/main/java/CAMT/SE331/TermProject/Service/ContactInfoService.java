package CAMT.SE331.TermProject.Service;

import CAMT.SE331.TermProject.Entity.ContactInfo;

/**
 * Created by Pktaro on 5/4/2015.
 */
public interface ContactInfoService {
    ContactInfo getContactInfo();
    ContactInfo updateContactInfo(ContactInfo contactInfo);
}
