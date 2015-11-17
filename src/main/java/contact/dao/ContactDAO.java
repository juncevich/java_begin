package contact.dao;

import contact.entity.Contact;

import java.util.List;

public interface ContactDAO {
    public Long addContact(Contact contact);

    public void updateContact(Contact contact);

    public void deleteContact(Long contactId);

    public List<Contact> findContacts();
}
