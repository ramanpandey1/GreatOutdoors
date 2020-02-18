package com.capgemini.greatoutdoors.service;

import java.util.HashMap;

import com.capgemini.greatoutdoors.dao.CancelDaoImpl;
import com.capgemini.greatoutdoors.dto.ProductDTO;
import com.capgemini.greatoutdoors.exceptions.CancelException;

import com.capgemini.greatoutdoors.util.ProductRepository;

public class CancelServiceImpl implements CancelService  {
	 CancelDaoImpl CancelDaoImplObj=new CancelDaoImpl();
	public boolean addToOrder(String pid) throws CancelException {
		// TODO Auto-generated method stub
		boolean result=false;
		if(ProductRepository.productList.get(pid) != null)
		{   if(CancelDaoImpl.orderlist.containsKey(pid))
	          	{	
			        throw new CancelException("Order already contain this PRODUCT\n");
	        	}
		   else {
			 result=CancelDaoImplObj.addToOrder(pid);
		    return result;
		      }
			
		}
		else
		{
			throw new CancelException("Product ID not Found in Product List to Add in ORDERLIST\n");
		}
	}

	public boolean removeProductFromOrder(String pid) throws CancelException {
		// TODO Auto-generated method stub
		boolean result=false;
		if(CancelDaoImpl.orderlist.get(pid) != null)
		{
		
			result=CancelDaoImplObj.removeProductFromOrder(pid);
			return result;
		}
		else
		{   
			throw new CancelException("Product ID not found in ORDER to REMOVE\n");
		}
	
	
	}

	public boolean removeOrder() throws CancelException {
		// TODO Auto-generated method stub
		boolean result=false;
		if(CancelDaoImpl.orderlist.isEmpty()==false)
		{
			result=CancelDaoImplObj.removeOrder();
			return result;
		}
		else
		{
			throw new CancelException("Order is not there");
		}
	}

	@Override
	public  HashMap<String, ProductDTO> displayOrder() {
		// TODO Auto-generated method stub
		HashMap<String, ProductDTO> list1=CancelDaoImplObj.displayOrder();
		return list1;
	}

	
	

}
