package com.system.controller;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.system.entity.Customer;
import com.system.model.customerDTO;

import com.system.util.CustomerConvertor;
import com.system.service.CustomerService;
@RestController

public class customercontroller {
	
	@Autowired
	private CustomerService customerService;
	@Autowired
	private CustomerConvertor customerConverter;
	
	@PostMapping("/create")
	public String createCustomer(@RequestBody customerDTO customerDTO) {
		final Customer customer = customerConverter.convertCustomerDTOToCustomerEntity(customerDTO);
		return customerService.createCustomer(customer);
	}
	
	@PutMapping("/update/{id}")
	public customerDTO updatedish(@PathVariable("id") int id,@RequestBody customerDTO customerDto) {
		 Customer customer = customerConverter.convertCustomerDTOToCustomerEntity(customerDto);
		return customerService.updateCustomer(id, customer);
	}
	
	@GetMapping("/get/{id}")
	public customerDTO getCustomer(@PathVariable("id") int id) {
		return customerService.getCustomer(id);
	}
	
	@GetMapping("/getAll")
	public List<customerDTO> getAllCustomer(){
		return customerService.getAllCustomer();
	}
	
	@DeleteMapping("/del/{id}")
	public String deleteCustomerById(@PathVariable("id") int id) {
		return customerService.deleteCustomer(id);
	}
	
	@DeleteMapping("/delAll")
	public ResponseEntity<String> deleteAllCustomer(){
		customerService.deleteAllCustomer();
		return new ResponseEntity<String>("All Customer Details Are Deleted",HttpStatus.OK);
	}
	
	
	@GetMapping("/getByName/{name}")
	public List<customerDTO> getCustomerByName(@PathVariable("customername") String customername){
		return customerService.getCustomerByName(customername);
	}
	@GetMapping("/getByPrice/{price}")
	public List<customerDTO> getCustomerByPrice(@PathVariable("price") long price){
		return customerService.getCustomerByPrice(price);
	}
		

}
