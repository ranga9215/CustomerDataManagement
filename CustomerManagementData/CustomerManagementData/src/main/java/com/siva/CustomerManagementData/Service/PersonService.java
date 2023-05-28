package com.siva.CustomerManagementData.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siva.CustomerManagementData.Entity.Person;
import com.siva.CustomerManagementData.Repository.PersonDAO;

@Service
public class PersonService {
 
	@Autowired
	private PersonDAO dao;
	
	public Person savePerson(Person person) {
		return dao.save(person);
	}
}
