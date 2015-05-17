package CAMT.SE331.TermProject.Service.ServiceImpl;

import CAMT.SE331.TermProject.Dao.ContactInfoDao;
import CAMT.SE331.TermProject.Entity.ContactInfo;
import CAMT.SE331.TermProject.Service.ContactInfoService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Pktaro on 5/5/2015.
 */
public class ContactInfoServiceImpl implements ContactInfoService{

    @Autowired
    ContactInfoDao contactInfoDao;

    @Override
    public ContactInfo getContactInfo() {
        return contactInfoDao.getContactInfo();
    }

    @Override
    public ContactInfo updateContactInfo(ContactInfo contactInfo) {
        return contactInfoDao.editContactInfo(contactInfo);
    }
}
