package com.capgemini.greatoutdoors.servicetest;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.capgemini.greatoutdoors.dto.ProductDTO;
import com.capgemini.greatoutdoors.exceptions.CancelException;
import com.capgemini.greatoutdoors.exceptions.WishListException;
import com.capgemini.greatoutdoors.service.CancelServiceImpl;

public class CancelServiceImplTest {
	CancelServiceImpl obj=new CancelServiceImpl();
	@Test
	public void addToOrder()
	{
		/*Throwable exception= assertThrows(CancelException.class, ()-> 
		{
			obj.addToOrder("P110");
		},"Product ID not Found in Product List to Add in ORDERLIST\n");
		assertEquals("Product ID not Found in Product List to Add in ORDERLIST\n",exception.getMessage());*/
		assertThrows(CancelException.class, ()->obj.addToOrder("P104"));
     }
		
	@Test
	public void removeProductFromOrder()
	{ 
		
		/* Throwable exception= assertThrows(WishListException.class, ()-> 
			{
				obj.removeProductFromOrder("P110");
			},"Product ID not found in ORDER to REMOVE\n");
			assertEquals("Product ID not ORDER in Wishlist to REMOVE\n",exception.getMessage());*/
		assertThrows(CancelException.class, ()->obj.removeProductFromOrder("P104"));
	}
	@Test
	public void removeOrder()
	{
		assertThrows(CancelException.class, ()->obj.removeOrder());
	}
	@Test
	public void displayOrder()
	{
		HashMap<String, ProductDTO> list1=new HashMap<String, ProductDTO>();
		 Assert.assertEquals( list1,obj.displayOrder());
	}
	
}