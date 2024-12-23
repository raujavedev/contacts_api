package com.rj.contactsapi.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rj.contactsapi.model.ContactModel;
import com.rj.contactsapi.service.ContactService;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping
    public ArrayList<ContactModel> getContact() {
        return this.contactService.getContact();
    }

    @PostMapping
    public ContactModel saveContact(@RequestBody ContactModel contact) {
        return this.contactService.saveContact(contact);
    }

    @GetMapping(path = "/{id}")
    public Optional<ContactModel> getContactById(@PathVariable("id") Long id) {
        return this.contactService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public ContactModel updateByIModel(@RequestBody ContactModel request, @PathVariable("id") long id) {
        return this.contactService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") long id) {
        boolean ok = this.contactService.deleteContact(id);
        if (ok) {
            return "Contact successfully deleted.";
        } else {
            return "Failed to delete contact. Please try again.";
        }
    }
}
