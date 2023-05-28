package com.siva.CustomerManagementData.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siva.CustomerManagementData.Entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
