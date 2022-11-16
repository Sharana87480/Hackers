package com.zohocrm2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm2.Entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
