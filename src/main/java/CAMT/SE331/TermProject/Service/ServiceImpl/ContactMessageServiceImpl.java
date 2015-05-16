package CAMT.SE331.TermProject.Service.ServiceImpl;

import CAMT.SE331.TermProject.Dao.ContactMessageDao;
import CAMT.SE331.TermProject.Entity.ContactMessage;
import CAMT.SE331.TermProject.Service.ContactMessageService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Pktaro on 5/5/2015.
 */
public class ContactMessageServiceImpl implements ContactMessageService{
    @Autowired
    ContactMessageDao contactMessageDao;
    @Override
    public ContactMessage addContactMessage(ContactMessage contactMessage) {
        return contactMessageDao.addContactMessage(contactMessage);
    }

    @Override
    public ContactMessage updateContactMessage(ContactMessage contactMessage) {
        return contactMessageDao.editContactMessage(contactMessage);
    }

    @Override
    public List<ContactMessage> getContactMessages() {
        return contactMessageDao.getContactMessages();
    }
}
