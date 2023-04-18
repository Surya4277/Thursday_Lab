package com.system.service;

import java.util.List;



import com.system.entity.Shop;
import com.system.model.shopDTO;

public interface ShopService {
	
	//Abstract method

	String createShop(Shop shop);
	shopDTO updateShop(int shop_id,Shop shop);
	shopDTO getShopById(int shop_id);
	List<shopDTO> getAllShops();
	String deleteShopById(int shop_id);
	void deleteAllShops();
	
	shopDTO assignDishToShop(int shop_id,int customerid);
	
	List<shopDTO> getShopByShopName(String shopname);
	List<shopDTO> getShopByEmail(String email);
	List<shopDTO> getShopByPhone(long phone);
	List<shopDTO> getShopByCustomer(int customer_id);
	shopDTO assignCustomerToShop(int id, int customer_id);
	
	
	
	
}
