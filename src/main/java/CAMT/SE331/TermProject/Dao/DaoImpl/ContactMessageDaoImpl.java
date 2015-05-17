package CAMT.SE331.TermProject.Dao.DaoImpl;

import CAMT.SE331.TermProject.Dao.ContactMessageDao;
import CAMT.SE331.TermProject.Entity.ContactMessage;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Created by GolfPapilio on 5/5/15.
 */
@Repository
public class ContactMessageDaoImpl implements ContactMessageDao {
  private Set<ContactMessage> contactMessages;

    public ContactMessageDaoImpl(){
        ContactMessage[] initContactMassage ={
            new ContactMessage(1,"status1","contactInfo1","reply1")
        };
        contactMessages = new TreeSet<ContactMessage>(Arrays.asList(initContactMassage));
    }


    @Override
    public ContactMessage addContactMessage(ContactMessage contactMessage) {

        return contactMessage;
    }

    @Override
    public ContactMessage editContactMessage(ContactMessage contactMessage) {

        return contactMessage;
    }

    @Override
    public List<ContactMessage> getContactMessages() {
        return new ArrayList<ContactMessage>(contactMessages);
    }
}
