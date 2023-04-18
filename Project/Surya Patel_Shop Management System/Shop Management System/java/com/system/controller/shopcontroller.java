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

import com.system.entity.Shop;
import com.system.model.shopDTO;
import com.system.service.ShopService;
import com.system.util.ShopConvertor;

@RestController
public class shopcontroller {
	
	@Autowired
	private ShopService shopService;
	@Autowired
	private ShopConvertor shopconvertor;
	
	@PostMapping("/createShop")
	public String createShop(@RequestBody Shop shopDto) {
		final Shop shop = shopconvertor.convertShopDTOToShopEntity(shopDto);
		return shopService.createShop(shop);
	}
	
	@PutMapping("/updateShop/{id}")
	public shopDTO updateShop(@PathVariable("id") int id ,@RequestBody Shop shopDto) {
		Shop shop = shopconvertor.convertShopDTOToShopEntity(shopDto);
		return shopService.updateShop(id, shop);
		
	}
	
	@GetMapping("/getShop/{id}")
	public shopDTO getShop(@PathVariable("id") int id) {
		return shopService.getShopById(id);
	}
	
	@GetMapping("/getAllShop")
	public List<shopDTO> getAllShop(){
		return shopService.getAllShops();
	}
	
	@DeleteMapping("/deleteShop/{id}")
	public String deleteShop(@PathVariable("id") int id) {
		return shopService.deleteShopById(id);
	}
	@DeleteMapping("/deleteAll")
	public ResponseEntity<String> deleteAll(){
		shopService.deleteAllShops();
		return new ResponseEntity<String>("All Details Are Deleted" , HttpStatus.OK);
	}
	@PostMapping("/assign/{id}/{customer_id}")
	public ResponseEntity<String> assignshopToCustomerId(@PathVariable("id") int id,@PathVariable("shop_Id") int customer_id) {
		shopService.assignCustomerToShop(id,customer_id);
		return new ResponseEntity<String>("shopkeeper is created having id :"+customer_id+" is "+customer_id ,HttpStatus.OK);
	}
	
	
	@GetMapping("/getByName/{Shopname}")
	public List<shopDTO> getShopByName(@PathVariable("shopname") String shopName){
		return shopService.getShopByShopName(shopName);
	}

	@GetMapping("/getByPhone/{phone}")
	public List<shopDTO> getShopByPhone(@PathVariable("phone") long phone) {
		return shopService.getShopByPhone(phone);
	}
	
	@GetMapping("/getByEmail/{email}")
	public List<shopDTO> getShopbyEmail(@PathVariable("email") String Email){
		return shopService.getShopByEmail(Email);
	}
	@GetMapping("/getByCutomer/{id}")
	public List<shopDTO> getShopByShop_id(@PathVariable("id") int shop_id){
		return shopService.getShopByCustomer( shop_id);
	}

}


