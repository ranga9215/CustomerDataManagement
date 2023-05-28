package com.siva.CustomerManagementData.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.siva.CustomerManagementData.Entity.Person;
@Repository
public class PersonDAO {
	@Autowired
	private PersonRepository repository;
	public Person save(Person person) {
		return repository.save(person);
		
	}

}
