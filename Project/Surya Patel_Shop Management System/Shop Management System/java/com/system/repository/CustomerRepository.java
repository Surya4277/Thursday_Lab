package com.system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.system.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

	@Query("from Customer where customerName like :s%")
	List<Customer> getCustomerByName(@Param("s") String customerName);
	
	
	@Query("from Customer where dishPrice =:s")
	List<Customer> getCustomerByPrice(@Param("s")long Price);


	
}

