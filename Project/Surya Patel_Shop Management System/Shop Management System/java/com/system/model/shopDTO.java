package com.system.model;



import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.system.entity.Customer;


import lombok.*;

@Getter
@Setter

public class shopDTO {
	
	private int hotel_id;
	@NotNull
	@Size(min=2)
	private String hotelname;
	@NotNull
	@Size(min=2)
	private long phone;
	@NotNull
	@Size(min=2)
	private String email;
	private Customer customer;
	

}
