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
		
		assertThrows(CancelException.class, ()->obj.addToOrder("P104"));
     }
		
	@Test
	public void removeProductFromOrder()
	{ 
		
		assertThrows(CancelException.class, ()->obj.removeProductFromOrder("P104"));
	}
	@Test
	public void removeOrder()
	{
		assertThrows(CancelException.class, ()->obj.removeOrder());
	}
	@Test
	public void displayOrder() throws CancelException
	{
		HashMap<String, ProductDTO> list1=new HashMap<String, ProductDTO>();
		
		assertThrows(CancelException.class,()->obj.displayOrder());
		
		
	}
	
}
