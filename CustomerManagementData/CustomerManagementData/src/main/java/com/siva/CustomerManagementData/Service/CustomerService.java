package com.siva.CustomerManagementData.Service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.siva.CustomerManagementData.Entity.Customer;
import com.siva.CustomerManagementData.Repository.CustomerDAO;
import com.siva.CustomerManagementData.Repository.CustomerRepository;
import com.siva.CustomerManagementData.dto.CustomerDTO;
import com.siva.CustomerManagementData.dto.ResponseStructure;


@Service
public class CustomerService {
//	@Autowired
//	private CustomerRepository repository;
//	
//	public Customer saveCustomer(Customer customer) {
//		return repository.save(customer);
//		
//	}
	@Autowired
	private CustomerDAO dao;
	
	public ResponseStructure<Customer> saveCustomer(CustomerDTO dto) {
		Customer cus = new Customer(dto);
		Customer customer=dao.saveCustomerDetails(cus);
		ResponseStructure<Customer> rs = new ResponseStructure<>();
		rs.setData(customer);
		rs.setStatusCode(HttpStatus.ACCEPTED.value());
		rs.setMessage("Customer data saved sucessfully");
		rs.setTimeStamp(LocalDateTime.now());
		return rs;
		
	}
//	public Customer saveCustomerDetails(Customer customer) {
//		return customerDAO.saveCustomerDetails(customer);
//		
//	}
//	
	public  ResponseStructure<Customer> updateCustomerDetails(Customer customer) {
		// TODO Auto-generated method stub
		Customer cus = dao.saveCustomerDetails(customer);
		
		ResponseStructure Custom = new ResponseStructure<>();
		Custom.setData(cus);
		Custom.setStatusCode(HttpStatus.ACCEPTED.value());
		Custom.setTimeStamp(LocalDateTime.now());
		Custom.setMessage(HttpStatus.ACCEPTED.name());
		return Custom;
	}
	
	public ResponseStructure<List<Customer>> getAllCustomerData() {
		// TODO Auto-generated method stub
		List<Customer> list = dao.getAllCustomerDate();
		ResponseStructure<List<Customer>> rs =new ResponseStructure<>();
		if(list.size()!=0)
			rs.setStatusCode(HttpStatus.ACCEPTED.value());
		    rs.setData(list);
		    rs.setTimeStamp(LocalDateTime.now());
		    rs.setMessage("No Customers entry found in data");

		return rs;
	}
	
	public Customer getCustomerDataById(int id) {
		// TODO Auto-generated method stub
		return dao.getCustomerDataById(id);
	}
	
	public Customer deleteCustomerDataById(int id) {
		// TODO Auto-generated method stub
		return dao.deleteCustomerDataById(id);
	}
	public List<Customer> getCustomerByName(String name){
		return dao.getCustomerByName(name);
	}
	public List<Customer> validateCustomer(String name, String email){
		return dao.validateCustomer(name, email);
	}
	

	

}
