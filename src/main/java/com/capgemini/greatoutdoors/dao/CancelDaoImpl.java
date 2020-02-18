package com.capgemini.greatoutdoors.dao;

import java.util.HashMap;
import com.capgemini.greatoutdoors.dto.ProductDTO;
import com.capgemini.greatoutdoors.util.ProductRepository;

public class CancelDaoImpl implements CancelDao{
	public static  HashMap<String, ProductDTO> orderlist=new HashMap<String , ProductDTO>();
	
/********************** This function will add the specified product to order list **********************/	
	
	public boolean addToOrder(String pid) {
		// TODO Auto-generated method stub
		 orderlist.put(pid,ProductRepository.productList.get(pid));
			return true;
		
	}

/********************** This function will remove specified product form order list **********************/
	
	public boolean removeProductFromOrder(String pid) {
		// TODO Auto-generated method stub
		orderlist.remove(pid);
		return true;
	}

/********************* This function will remove the order ***********************/	
	
	public boolean removeOrder() {
		// TODO Auto-generated method stub
		orderlist.clear();
		return true;
	}

/********************* This function will return the list to Service package *****************/
	
	public HashMap<String, ProductDTO> displayOrder() {
		// TODO Auto-generated method stub
		return orderlist;
	}

}
