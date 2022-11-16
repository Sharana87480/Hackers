package com.zohocrm2.Servicelayer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm2.Entity.Contact;
import com.zohocrm2.Repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepo;
	
	@Override
	public void saveOneContact(Contact c) {
		
		contactRepo.save(c);
	}

	@Override
	public List<Contact> listContact() 
	{
		List<Contact> contacts = contactRepo.findAll();
		return contacts;
	}

	@Override
	public Contact getOneContact(long id)
	{
	   Optional<Contact> findById = contactRepo.findById(id);
	   Contact contact = findById.get();
	   return contact;
		
	}

}
