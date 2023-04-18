package com.system.servicelmpl;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import com.system.entity.Customer;

import com.system.repository.CustomerRepository;
import com.system.service.CustomerService;

public class CustomerServiceImpl {

	@Autowired
	private CustomerService customerService;
	@MockBean
	private CustomerRepository customerRepository;{
		@DisplayName(value = "customer product Test");
     @Test
       void customer product Test();
		Customer customer = new Customer();
		customer.setproductrname("Maggie");
		customer.setPrice(35);
	
		Mockito.when(customerRepository.save(customer)).thenReturn(customer);
		assertThat(customerService.createCustomer(customer)).isEqualTo("New Cutomer is product..");
	}		
}
