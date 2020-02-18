package com.capgemini.greatoutdoors.dao;

import java.util.HashMap;
import com.capgemini.greatoutdoors.dto.ProductDTO;
import com.capgemini.greatoutdoors.util.ProductRepository;

public class WishlistDaoImpl implements WishlistDao {
	public static  HashMap<String, ProductDTO> wlist=new HashMap<String , ProductDTO>(); 
	public boolean addProductToWishlist(String productId) {
		// TODO Auto-generated method stub
	    wlist.put(productId,ProductRepository.productList.get(productId));
		return true;
	}

	public boolean removeProductFromWishlist(String productId) {
		// TODO Auto-generated method stub
		wlist.remove(productId);
		return true;
	}

	@Override
	public HashMap<String, ProductDTO> displayProductInWishlist() {
		// TODO Auto-generated method stub
		return wlist;
	}

	
	
		// TODO Auto-generated method stub

		/*for(Entry<String, ProductDTO> me:wlist.entrySet())
		{
			System.out.println("Product ID: "+me.getKey()+" ,Car Name: "+me.getValue().getProductName()+" , Product Category: "+me.getValue().getProductCategory()+" , Colour: "+me.getValue().getColor()+" , Specification: "+me.getValue().getSpecification()+" , Manufacturer: "+me.getValue().getManufacturer()+" , Price: "+me.getValue().getProductPrice());
		    System.out.println();
		}*/
		
		
	
	
	

}
