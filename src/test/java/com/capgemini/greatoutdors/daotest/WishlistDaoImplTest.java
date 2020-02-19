package com.capgemini.greatoutdors.daotest;



import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

import com.capgemini.greatoutdoors.dao.WishlistDaoImpl;
import com.capgemini.greatoutdoors.dto.ProductDTO;

public class WishlistDaoImplTest {
	WishlistDaoImpl obj=new WishlistDaoImpl();
 @Test
 public void addProductToWishlist()
 {
   assertEquals(true, obj.addProductToWishlist("P111") );

 }
 @Test
 public void removeProductFromWishlist()
 {
	 assertEquals(true, obj.removeProductFromWishlist("P105") );
 }
  @Test
  public void displayProductInWishlist()
  {
	  HashMap<String, ProductDTO> list1=new HashMap<String, ProductDTO>();
	  assertEquals(list1,obj.displayProductInWishlist());
  }
	
}
