package com.system.util;

import org.springframework.beans.BeanUtils;

import org.springframework.stereotype.Component;

import com.system.entity.Customer;
import com.system.entity.Shop;
import com.system.model.customerDTO;
import com.system.model.shopDTO;

@Component
public class CustomerConvertor {
	
	   //Method to converting DTO to entity
		public Customer convertCustomerDTOToCustomerEntity(customerDTO customerDTO)
		{
			Customer customer = new Customer(null, 0);     //Creating an Object
			if(customerDTO!=null)
			{
				BeanUtils.copyProperties(customerDTO, customer);  //Copy properties to dish.
			}
			return customer;
		}
		
		//Method to converting entity to DTO
		public customerDTO convertdishEntityToDishDto(Customer customer)
		{
			customerDTO customerDTO = new customerDTO();      //Creating an Object.
			if(customer!=null)
			{
				BeanUtils.copyProperties(customer, customerDTO);            //Copy properties to dishDto.
			}
			return customerDTO;
		}

		public customerDTO convertcustomerEntityToCustomerDto(Customer b) {
			// TODO Auto-generated method stub
			return null;
		}

		
		

}
