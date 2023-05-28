package com.siva.CustomerManagementData.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.siva.CustomerManagementData.dto.CustomerDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer_info")
public class Customer implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable  = false)
	private String name;
	
	private String email;
	
	
	public Customer(CustomerDTO dto)
	{
		this.id=dto.getId();
		this.name=dto.getName();
		this.email=dto.getEmail();
	}
	
	
	public Customer(int i, int value, String name2, String name3) {
		// TODO Auto-generated constructor stub
	}


//	public static void setData(Customer cus) {
//		// TODO Auto-generated method stub
//		
//	}


//	public int getAltkey() {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
