package com.capgemini.greatoutdors.daotest;
import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

import com.capgemini.greatoutdoors.dao.CancelDaoImpl;

import com.capgemini.greatoutdoors.dto.ProductDTO;
public class CancelDaoImplTest {
	CancelDaoImpl cancelobj=new CancelDaoImpl();
	 
@Test
public void addToOrder()
{
	 assertEquals(true, cancelobj.addToOrder("P101") );
}
@Test
public void removeProductFromOrder()
{
	assertEquals(true, cancelobj.removeProductFromOrder("P101") );
}
@Test
public void removeOrder()
{
	assertEquals(true, cancelobj.removeOrder() );
}



}
