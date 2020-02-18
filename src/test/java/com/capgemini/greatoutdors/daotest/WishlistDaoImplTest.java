package com.capgemini.greatoutdors.daotest;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.greatoutdoors.dao.WishlistDaoImpl;

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
	 assertEquals(true, obj.removeProductFromWishlist("P103") );
 }
 
	
}
