package com.rj.contactsapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rj.contactsapi.model.ContactModel;

public interface ContactRepository extends JpaRepository<ContactModel, Long> {

}
