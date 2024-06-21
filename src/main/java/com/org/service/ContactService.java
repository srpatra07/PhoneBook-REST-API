package com.org.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.binding.Contact;
import com.org.repo.ContactRepo;

@Service
public class ContactService {

	@Autowired
	ContactRepo repo;
	
	
	public Contact saveAndUpdateContact(Contact contact)
	{
		return repo.save(contact);
	}
	
	public Contact viewContact(String email)
	{
		Optional<Contact> con = repo.findById(email);
		Contact contact = con.get();
		return contact;
	}
	
	public String deleteContact(String email)
	{
		repo.deleteById(email);
		return "Contact deleted successfully...";
	}
	
	public List<Contact> viewAllContacts()
	{
		List<Contact> list = repo.findAll();
		return list;
	}
	
}
