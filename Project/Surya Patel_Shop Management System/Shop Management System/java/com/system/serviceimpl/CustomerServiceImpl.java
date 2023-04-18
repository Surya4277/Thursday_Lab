package com.system.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.system.entity.Customer;
import com.system.exception.CustomerNotFoundException;
import com.system.model.customerDTO;
import com.system.repository.CustomerRepository;
import com.system.service.CustomerService;
import com.system.util.CustomerConvertor;

public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	CustomerConvertor customerConverter;
	
	
	
	@Override
	public String createCustomer(Customer customer) {        //Method for order Customer.
		String message=null;
		customerRepository.save(customer);              //Saving shop to database.
		if(customer!=null)
		{
			message="New Customer saved successfully!!";
		}
		else
		{
			message="Customer was not saved!!";
		}
		return message;
	}     //End of the method.

	@Override
	public customerDTO updateCustomer(int id, Customer customer) {     // Method for updating.
		Customer getCustomer = customerRepository.findById(id).orElseThrow(()-> new CustomerNotFoundException("Customer","ID",id));
		getCustomer.setcustomername((customer).getcustomername());
		getCustomer.setPrice(customer.getPrice());
		customerRepository.save(getCustomer);
		return customerConverter.convertcustomerEntityToCustomerDto(getCustomer);
	}

	@Override
	public customerDTO getCustomer(int id) {                 //Method for getting Customer by id.
		Customer customer = customerRepository.findById(id).orElseThrow(()-> new CustomerNotFoundException("Customer","ID",id));	
		return customerConverter.convertcustomerEntityToCustomerDto(customer);
	}

	@Override
	public List<customerDTO> getAllCustomer() {                  //Method for getting all id.
		List<Customer>customerList =customerRepository.findAll();
		List<customerDTO> customerDto = new ArrayList<>();
		for(Customer b: customerList) {
			customerDto.add(customerConverter.convertcustomerEntityToCustomerDto(b));
		}
			return customerDto;
	}
	
	

	@Override
	public String deleteCustomer(int id) {           //Method for deleting Customer by id
		String message=null;
		Optional<Customer> customer=customerRepository.findById(id);
		if(customer.isPresent()) {		
			customerRepository.deleteById(id);
			message = "..........Customer order Delteted  Successfully.........";
		}
		else {
			message = ".........Details are not found........  ==> "+id+"\n ----Enter Customer Name !";
		}
		return message;
	}

	@Override
	public void deleteAllCustomer() {               //Method for deleting all Customer
		customerRepository.deleteAll();	
		
	}
	
	@Override
	public List<customerDTO> getCustomerByName(String customerName) {              
		List<Customer> customer = customerRepository.getCustomerByName(customerName);
		List<customerDTO> customerDto = new ArrayList<>();
		for(Customer a: customer) {
			customerDto.add(customerConverter.convertcustomerEntityToCustomerDto(a));
		}
		return customerDto;
	}
	@Override
	public List<customerDTO> getCustomerByPrice(long Price) {
		List<Customer> customer = customerRepository.getCustomerByPrice(Price);
		List<customerDTO>customerDto = new ArrayList<>();
		for(Customer a: customer) {
			customerDto.add(customerConverter.convertcustomerEntityToCustomerDto(a));
		}
		return customerDto;

	}

	
	
}
