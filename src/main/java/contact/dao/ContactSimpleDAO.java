package contact.dao;


import contact.entity.Contact;

import java.util.List;

class ContactSimpleDAO implements ContactDAO {
    @Override
    public Long addContact(Contact contact) {
        return null;
    }

    @Override
    public void updateContact(Contact contact) {

    }

    @Override
    public void deleteContact(Long contactId) {

    }

    @Override
    public List<Contact> findContacts() {
        return null;
    }
}
