package com.system.entity;


import javax.persistence.*;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


//@JsonIgnoreProperties({"hibernateLazyInitialier"})
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="shop")

public class Shop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int shop_id;
	
	@Column(name="shopname", unique= true, length =50)
	private String shopname;
	
	@Column(name="phone", unique= true, length =50)
	private long phone; 
	
	@Column(name="email", unique= true, length=50)
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="customer_id")
	private Customer customer;

	public int getShop_id() {
		return shop_id;
	}

	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
   
	
	@Builder
	public Shop( String shopname, long phone) {
		super();
		this.shopname = shopname;
		this.phone = phone;
		this.email = email;
	}
	
}
