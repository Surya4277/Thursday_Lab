package com.system.serviceimpl;

import java.util.ArrayList;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.entity.Customer;
import com.system.entity.Shop;
import com.system.exception.CustomerNotFoundException;
import com.system.exception.ShopNotFoundException;
import com.system.model.shopDTO;
import com.system.repository.CustomerRepository;
import com.system.repository.ShopRepository;
import com.system.service.ShopService;
import com.system.util.ShopConvertor;




@Service
public abstract  class ShopServiceImpl implements ShopService {
	
	@Autowired
	private ShopRepository shopRepository;     // Instance of hotel repository
	
	@Autowired
	private ShopConvertor shopconvertor;  
	@Autowired
	private CustomerRepository customerRepository;   
	       

	@Override
	public String createShop(Shop shop) {   //method creating new Shop
		String message=null;
		shopRepository.save(shop);      //Saving Shop to database.
		if(shop!=null)
		{
			message="Shop details saved sucessfully";
		}
		return message;
	}   //End the method

	@Override
	public shopDTO updateShop(int id, Shop shop) {
		// TODO Auto-generated method stub
			Shop getShop = shopRepository.findById(id).get();
				getShop.setShopname(shop.getShopname());
				getShop.setPhone(shop.getPhone());
				getShop.setEmail(shop.getEmail());
				
				
				shopRepository.save(getShop);
				return ShopConvertor.convertShopEntityToShopDTO(getShop);
			}    

	@Override
	public shopDTO getShopById(int id) {    //Method for getting Shop detail by id
		
		Shop shop = shopRepository.findById(id).get();		
		return ShopConvertor.convertShopEntityToShopDTO(shop);
	}
	@Override
	public List<shopDTO> getAllShops() {
		List<Shop> shop = shopRepository.findAll();
		List<shopDTO> shopDto = new ArrayList<>();
		for(Shop a: shop) {
			shopDto.add(ShopConvertor.convertShopEntityToShopDTO(a));
		}
		return shopDto;
	}

	@Override
	public String deleteShopById(int id) {
		String message=null;
		Optional<Shop> shop=shopRepository.findById(id);
		if(shop.isPresent()) {		
			shopRepository.deleteById(id);
			message = "Shop Deleted Successfully.....";
		}
		else {
			message = "Shop Details are not found... ==> "+id+"\n ----Enter Correct Shop Id !";
		}
		return message;
	}

	@Override
	public void deleteAllShops() {
		// TODO Auto-generated method stub
		shopRepository.deleteAll();
	}

	@Override
	public  shopDTO assignCustomerToShop(int id, int customer_id) {
		Shop shop = shopRepository.findById(id).orElseThrow(()-> new ShopNotFoundException("Shop","ID",id));
		Customer customer = customerRepository.findById(customer_id).orElseThrow(()-> new CustomerNotFoundException("Shop","ID",id));
		shop.setCustomer(customer);
	shopRepository.save(shop);
		return shopconvertor.convertShopEntityToShopDTO(shop);
	}
	@Override 
	public List<shopDTO> getShopByShopName(String shopname) {
		List<Shop> shop = shopRepository.getshopByshopName(shopname);
		List<shopDTO> shopDto = new ArrayList<>();
		for(Shop a: shop) {
		shopDto.add(shopconvertor.convertShopEntityToShopDTO(a));
		}
		return shopDto;
	}

	@Override
	public List<shopDTO> getShopByEmail(String email) {
		List<Shop> shop = shopRepository.getShopByEmail(email);
		List<shopDTO>shopDto = new ArrayList<>();
		for(Shop a: shop) {
			shopDto.add(shopconvertor.convertShopEntityToShopDTO(a));
		}
		return shopDto;
	}

	@Override
	public List<shopDTO> getShopByPhone(long  phone) {
		List<Shop> shop = shopRepository.getShopByPhone(phone);
		List<shopDTO> shopDto = new ArrayList<>();
		for(Shop a: shop) {
			shopDto.add(shopconvertor.convertShopEntityToShopDTO(a));
		}
		return shopDto;
	}

	@Override
	public List<shopDTO> getShopByCustomer(int  customer_id) {
		List<Shop> shop = shopRepository.getShopByCustomer(customer_id);
		List<shopDTO> shopDto = new ArrayList<>();
		for(Shop a: shop) {
			shopDto.add(shopconvertor.convertShopEntityToShopDTO(a));
		}
		return shopDto;
	
	
		}
			
		}
	

