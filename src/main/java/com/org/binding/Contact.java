package com.org.binding;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Contact {

	@Id
	private String email;
	private String name;
	private long phNo;
	
}
