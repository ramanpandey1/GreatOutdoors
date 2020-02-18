package com.capgemini.greatoutdoors.service;

import java.util.HashMap;

import com.capgemini.greatoutdoors.dao.CancelDaoImpl;
import com.capgemini.greatoutdoors.dto.ProductDTO;
import com.capgemini.greatoutdoors.exceptions.CancelException;

import com.capgemini.greatoutdoors.util.ProductRepository;

public class CancelServiceImpl implements CancelService  {
	 CancelDaoImpl CancelDaoImplObj=new CancelDaoImpl();
	 
/***************** This function will add specified  product to Order *****************/
	 
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

/************************ This function will remove specified Product from Order ************************/
	
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

/*************************** This function will remove the order ************************/
	
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

/********************** This function call the displayOrder function and return the list in Dao Package **********************/
	
	public  HashMap<String, ProductDTO> displayOrder() {
		// TODO Auto-generated method stub
		HashMap<String, ProductDTO> list1=CancelDaoImplObj.displayOrder();
		return list1;
	}

	
	

}
