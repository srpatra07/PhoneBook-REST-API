package com.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.binding.Contact;

@RestController
public class ContactRestController {
	
	@Autowired
	ContactService service;

	@PostMapping("/saveAndUpdate")
	public ResponseEntity<Contact> saveAndUpdateContact(@RequestBody Contact contact)
	{
		Contact con = service.saveAndUpdateContact(contact);
		return new ResponseEntity<Contact>(con,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/view/{email}")
	public ResponseEntity<Contact>  viewContact(@PathVariable String email)
	{
		Contact contact = service.viewContact(email);
		return new ResponseEntity<Contact>(contact,HttpStatus.OK);
	}
	
	@GetMapping("/delete/{email}")
	public ResponseEntity<String> deleteContact(@PathVariable String email)
	{
		String msg = service.deleteContact(email);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/view")
	public ResponseEntity<List<Contact>> viewAllContacts()
	{
		List<Contact> list = service.viewAllContacts();
		return new ResponseEntity<List<Contact>>(list,HttpStatus.OK);
	}
	
}
