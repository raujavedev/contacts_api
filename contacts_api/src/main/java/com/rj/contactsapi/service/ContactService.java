package com.rj.contactsapi.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rj.contactsapi.model.ContactModel;
import com.rj.contactsapi.repositories.ContactRepository;

@Service
public class ContactService {

    @Autowired
    ContactRepository contactRepository;

    public ArrayList<ContactModel> getContact() {
        return (ArrayList<ContactModel>) contactRepository.findAll();
    }

    public ContactModel saveContact(ContactModel contact) {
        return contactRepository.save(contact);
    }

    public Optional<ContactModel> getById(Long id) {
        return contactRepository.findById(id);
    }

    public ContactModel updateById(ContactModel request, Long id) {
        ContactModel contact = contactRepository.findById(id).get();

        contact.setFirstName(request.getFirstName());
        contact.setLastName(request.getLastName());
        contact.setEmail(request.getEmail());
        contact.setPhone(request.getPhone());

        return contact;
    }

    public boolean deleteContact(Long id) {
        try {
            contactRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
