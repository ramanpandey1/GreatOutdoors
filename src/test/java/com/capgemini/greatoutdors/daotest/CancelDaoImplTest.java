package com.capgemini.greatoutdors.daotest;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.greatoutdoors.dao.CancelDaoImpl;
import com.capgemini.greatoutdoors.dao.WishlistDaoImpl;
public class CancelDaoImplTest {
	CancelDaoImpl cancelobj=new CancelDaoImpl();
@Test
public void addToOrder()
{
	 assertEquals(true, cancelobj.addToOrder("P102") );
}
@Test
public void removeProductFromOrder()
{
	assertEquals(true, cancelobj.removeProductFromOrder("P103") );
}
@Test
public void removeOrder()
{
	assertEquals(true, cancelobj.removeOrder() );
}
@Test
public void displayOrder()
{
	
}


}
