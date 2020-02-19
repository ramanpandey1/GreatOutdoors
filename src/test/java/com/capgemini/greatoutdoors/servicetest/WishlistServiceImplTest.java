package com.capgemini.greatoutdoors.servicetest;


import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import static org.junit.Assert.*;

import org.junit.Assert;
import   org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.capgemini.greatoutdoors.dto.ProductDTO;
import com.capgemini.greatoutdoors.exceptions.WishListException;
import com.capgemini.greatoutdoors.service.WishlistServiceImpl;
public class WishlistServiceImplTest {
	
	 WishlistServiceImpl obj=new WishlistServiceImpl();
	@Test()
	 public void addProductToWishlist() 
	 {
		assertThrows(WishListException.class, ()->obj.addProductToWishlist("P110"));
	
	  
	 }
	 @Test()
	 public void removeProductFromWishlist()  
	 {assertThrows(WishListException.class, ()-> obj.removeProductFromWishlist("P104"));
	  
		
	}
	 @Test()
	 public void displayProductInWishlist()  throws WishListException
	 {  HashMap<String, ProductDTO> list1=new HashMap<String, ProductDTO>();
		 Assert.assertEquals( list1,obj.displayProductInWishlist());
		// assertThrows(WishListException.class, ()-> obj.displayProductInWishlist());
	 }
	 
}
