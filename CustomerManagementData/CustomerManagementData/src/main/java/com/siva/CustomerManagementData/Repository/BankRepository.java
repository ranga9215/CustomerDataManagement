package com.siva.CustomerManagementData.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siva.CustomerManagementData.Entity.BankAccount;

public interface BankRepository extends JpaRepository<BankAccount,Integer>{

}
