package com.siva.CustomerManagementData.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class CustomerDTO implements Serializable {

	private Integer id;
	private String name;
	private String email;
	
}
