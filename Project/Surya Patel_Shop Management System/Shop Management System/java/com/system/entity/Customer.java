package com.system.entity;

import javax.persistence.*;




import lombok.*;

//@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="dish")

public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="customername")
	private String customername;
	
	@Column(name="price")
	private long price;
	
	//@ManyToOne(fetch=FetchType.LAZY)
	//private Hotel hotel;



@Builder
public Customer( String customername, long price) {
	super();
	this.customername =customername;
	this.price = price;
	
}

 

public Customer() {
	// TODO Auto-generated constructor stub
}



public String getDishname() {
	return customername;
}

public void setDishname(String customername) {
	this.customername = customername;
}

public long getPrice() {
	return price;
}

public void setPrice(long price) {
	this.price = price;
}

public static Object builder() {
	// TODO Auto-generated method stub
	return null;
}



public Object getcustomername() {
	// TODO Auto-generated method stub
	return null;
}



public void setcustomername(Object getcustomername) {
	// TODO Auto-generated method stub
	
}



public Object getCustomername() {
	// TODO Auto-generated method stub
	return null;
}



public void setCustomername(String string) {
	// TODO Auto-generated method stub
	
}



public void setproductrname(String string) {
	// TODO Auto-generated method stub
	
}



}
