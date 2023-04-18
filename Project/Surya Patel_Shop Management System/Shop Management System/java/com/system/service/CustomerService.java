package com.system.service;
 import org.springframework.beans.factory.annotation.Autowired;
import com.system.service.CustomerService;

import java.util.List;
import com.system.entity.Customer;
import com.system.model.customerDTO;
import com.system.controller.customercontroller;

public interface CustomerService {
	
	//Abstract method
	
	String createCustomer(Customer customer);
	customerDTO updateCustomer(int id,Customer customer);
	customerDTO getCustomer(int id);	
	List<customerDTO> getAllCustomer();
	String deleteCustomer(int id);
	void deleteAllCustomer();
	
	List<customerDTO> getCustomerByName(String customerName);
	List<customerDTO> getCustomerByPrice(long Price);
	
}
