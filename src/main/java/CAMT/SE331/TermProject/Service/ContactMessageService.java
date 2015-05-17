package CAMT.SE331.TermProject.Service;

import CAMT.SE331.TermProject.Entity.ContactMessage;

import java.util.List;

/**
 * Created by Pktaro on 5/4/2015.
 */
public interface ContactMessageService {
    void addContactMessage(ContactMessage contactMessage);
    void updateContactMessage(ContactMessage contactMessage);
    List<ContactMessage> getContactMessages();
}
