package com.siva.CustomerManagementData.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.siva.CustomerManagementData.Entity.Customer;
import com.siva.CustomerManagementData.Service.CustomerService;
import com.siva.CustomerManagementData.dto.CustomerDTO;
import com.siva.CustomerManagementData.dto.ResponseStructure;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@PostMapping("customer")
	public @ResponseBody ResponseStructure<Customer> saveCustomer(@RequestBody CustomerDTO dto) {
	return service.saveCustomer(dto);
	}
	
	@PutMapping(value = "customer")
	public @ResponseBody ResponseStructure<Customer> updateCustomerDetails(@RequestBody Customer customer) {
		return service.updateCustomerDetails(customer);
		
	}
	@GetMapping(value = "customer")
	public @ResponseBody ResponseStructure<List<Customer>> getAllCustomerData(){
		return service.getAllCustomerData();
		
	}
	@GetMapping(value = "customer/{id}")
	public @ResponseBody Customer getCustomerDataById(@PathVariable("id") int id) {
		return service.getCustomerDataById(id);
		
	}
	@DeleteMapping(value = "customer")
	public @ResponseBody Customer deletCustomerDataById(@RequestParam("id") int id) {
		return service.deleteCustomerDataById(id);
		
	}
	@GetMapping("/customerbyname/{name}")
	public @ResponseBody List<Customer> getCustomersByName
	(@PathVariable("name") String name){
		return service.getCustomerByName(name);
	}
	@PostMapping("/validateCustomer")
	public List<Customer> validateCustomer(@RequestParam ("name")String name, @RequestParam("email") String email){
		return  service.validateCustomer(name, email);
		
	}
	
}
