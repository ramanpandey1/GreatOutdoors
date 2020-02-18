package com.capgemini.greatoutdoors.dao;

import java.util.HashMap;


import com.capgemini.greatoutdoors.dto.ProductDTO;
import com.capgemini.greatoutdoors.util.ProductRepository;

public class CancelDaoImpl implements CancelDao{
	public static  HashMap<String, ProductDTO> orderlist=new HashMap<String , ProductDTO>();
	public boolean addToOrder(String pid) {
		// TODO Auto-generated method stub
		 orderlist.put(pid,ProductRepository.productList.get(pid));
			return true;
		
	}

	public boolean removeProductFromOrder(String pid) {
		// TODO Auto-generated method stub
		orderlist.remove(pid);
		return true;
	}

	public boolean removeOrder() {
		// TODO Auto-generated method stub
		orderlist.clear();
		return true;
	}

	@Override
	public HashMap<String, ProductDTO> displayOrder() {
		// TODO Auto-generated method stub
		return orderlist;
	}

	

	
	
	

}
