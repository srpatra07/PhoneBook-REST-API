package com.org.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.binding.Contact;

public interface ContactRepo extends JpaRepository<Contact, String>{

	
	
}
