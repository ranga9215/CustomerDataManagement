package com.siva.CustomerManagementData.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.siva.CustomerManagementData.Entity.Customer;

@Repository
public class CustomerDAO {
	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer saveCustomerDetails(Customer customer) {
		return customerRepository.save(customer);
		
	}
	public List<Customer> getAllCustomerDate(){
		return customerRepository.findAll();
	}
	public Customer getCustomerDataById(int id) {
		return customerRepository.findById(id).orElse(new Customer(HttpStatus.NOT_FOUND.value(),HttpStatus.NOT_FOUND.name(),HttpStatus.NOT_FOUND.name()));
		
	}
	public Customer deleteCustomerDataById(int id) {
		Customer customer = getCustomerDataById(id);
		if(customer.getId()!=404) {
			customerRepository.deleteById(id);
		}
		return null;
		
	}
	public  List<Customer>getCustomerByName(String name){
		return customerRepository.findByName(name);
	}
	public List<Customer> validateCustomer(String name, String email){
		return customerRepository.validateCustomer(name, email);
	}
}
