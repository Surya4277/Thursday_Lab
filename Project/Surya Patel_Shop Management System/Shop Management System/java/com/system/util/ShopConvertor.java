package com.system.util;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.BeanUtils;


import com.system.entity.Shop;
import com.system.model.shopDTO;

public class ShopConvertor {
	
	//Method for converting Dto to Entity
			public Shop convertShopDTOToShopEntity(Shop a) {
				
			Shop shop = new Shop(null,0); //creation of object
				if(shop!=null) {
					BeanUtils.copyProperties(shop ,shop); //copy properties of teams
				}
				return shop;
			}
			
			//Method for converting Entity to Dto
			public static shopDTO convertShopEntityToShopDTO(Shop a) {
				shopDTO shopDto = new shopDTO(); //creation of object
				if(shopDto!=null) {
					BeanUtils.copyProperties(a, shopDto); //copy properties of TeamsDto
				}
				return shopDto;
			}


			}

		
