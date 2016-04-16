package contact.dao;

import contact.entity.Contact;

import java.util.List;

public interface ContactDAO {
    Long addContact(Contact contact);

    void updateContact(Contact contact);

    void deleteContact(Long contactId);

    List<Contact> findContacts();
}
