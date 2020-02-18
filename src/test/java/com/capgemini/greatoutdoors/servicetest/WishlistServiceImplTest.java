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
	/*Throwable exception= assertThrows(WishListException.class, ()-> 
	{
		obj.addProductToWishlist("P110");
	},"Product ID not Found in Product List to Add in WishList\\n");
	assertEquals("Product ID not Found in Product List to Add in WishList\n",exception.getMessage());*/
	  
	 }
	 @Test()
	 public void removeProductFromWishlist()  
	 {assertThrows(WishListException.class, ()-> obj.removeProductFromWishlist("P104"));
	  
		/* Throwable exception= assertThrows(WishListException.class, ()-> 
			{
				obj.removeProductFromWishlist("P104");
			},"Product ID not found in Wishlist to REMOVE");
			assertEquals("Product ID not found in Wishlist to REMOVE",exception.getMessage());*/
	}
	 @Test()
	 public void displayProductInWishlist()
	 {  HashMap<String, ProductDTO> list1=new HashMap<String, ProductDTO>();
		 Assert.assertEquals( list1,obj.displayProductInWishlist());
	 }
	 
}
