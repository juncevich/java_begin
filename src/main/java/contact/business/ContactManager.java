package contact.business;


import contact.dao.ContactDAO;
import contact.dao.ContactDAOFactory;
import contact.entity.Contact;

import java.util.List;

public class ContactManager {
    private ContactDAO dao;

    public ContactManager() {
        dao = ContactDAOFactory.getContactDAO();
    }

    public Long addContact (Contact contact){
        return dao.addContact(contact);
    }

    public void updateContact(Contact contact){
        dao.updateContact(contact);
    }

    public void deleteContact(Long contactId){
        dao.deleteContact(contactId);
    }

    public Contact getContact(Long contactId){
        return dao.getContact(contactId);
    }

    public List<Contact> findContacts(){
        return dao.findContacts();
    }
}
