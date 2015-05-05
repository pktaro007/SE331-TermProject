package CAMT.SE331.TermProject.Dao;

import CAMT.SE331.TermProject.Entity.ContactMessage;

import java.util.List;

/**
 * Created by Pktaro on 5/3/2015.
 */
public interface ContactMessageDao {
    void addContactMessage(ContactMessage contactMessage);
    void editContactMessage(ContactMessage contactMessage);
    List<ContactMessage> getContactMessages();
}
