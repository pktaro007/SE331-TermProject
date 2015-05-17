package CAMT.SE331.TermProject.Dao.DaoImpl;

import CAMT.SE331.TermProject.Dao.ContactInfoDao;
import CAMT.SE331.TermProject.Entity.ContactInfo;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.*;
/**
 * Created by GolfPapilio on 5/5/15.
 */
@Repository
public class ContactInfoDaoImpl implements ContactInfoDao{
    private Set<ContactInfo> contactInfos;

    public ContactInfoDaoImpl(){
        ContactInfo[] initContactInfo ={
                new ContactInfo("googleMap1","address1","tel1","facebookLink1")
        };
        contactInfos =new TreeSet<ContactInfo>(Arrays.asList(initContactInfo));
    }

    @Override
    public ContactInfo getContactInfo(){
     return null;
    }
    @Override
    public ContactInfo editContactInfo(ContactInfo contactInfo){
        return null;
    }
}
