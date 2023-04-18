package com.system.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.system.entity.Shop;
import com.system.model.shopDTO;

public interface ShopRepository extends JpaRepository<Shop,Integer> {
	
	@Query("from shop where shopname =:s")
	List<Shop> getshopByshopName(@Param("s") String shopname);
	
	@Query("from shop where phone =:s%")
	List<Shop> getShopByPhone(@Param("s") long phone);
	
	@Query("from shop where email =:s")
	List<Shop> getShopByEmail(@Param("s") String email);
	
	@Query("from shop where customer_id =:s")
	List<Shop>  getShopByCustomer(@Param("s") int id);



}
