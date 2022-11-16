package com.zohocrm2.Servicelayer;

import java.util.List;

import com.zohocrm2.Entity.Contact;

public interface ContactService {

	void saveOneContact(Contact c);

	List<Contact> listContact();

	Contact getOneContact(long id);

}
