package com.capgemini.greatoutdoors.service;

import java.util.HashMap;

import com.capgemini.greatoutdoors.dao.WishlistDaoImpl;
import com.capgemini.greatoutdoors.dto.ProductDTO;
import com.capgemini.greatoutdoors.exceptions.WishListException;
import com.capgemini.greatoutdoors.util.ProductRepository;

public class WishlistServiceImpl implements WishlistService{
	//static  HashMap<String, ProductDTO> wlist1=new HashMap<String , ProductDTO>(); 
	WishlistDaoImpl WishlistDaoImplObj=new WishlistDaoImpl();
	
	
	public boolean addProductToWishlist(String productId) throws WishListException {
		// TODO Auto-generated method stub
		boolean result=false;
		if(ProductRepository.productList.get(productId) != null)
		{   if(WishlistDaoImpl.wlist.containsKey(productId))
	          	{	
			        throw new WishListException("WishList already contain this PRODUCT");
	        	}
		   else {
			 result=WishlistDaoImplObj.addProductToWishlist(productId);
		    return result;
		      }
			
		}
		else
		{
			throw new WishListException("Product ID not Found in Product List to Add in WishList\n");
		}
	   
		
	}

	 public boolean  removeProductFromWishlist(String productId) throws WishListException {
		// TODO Auto-generated method stub
		boolean result=false;
		if(WishlistDaoImpl.wlist.get(productId) != null)
		{
		
			result=WishlistDaoImplObj.removeProductFromWishlist(productId);
			return result;
		}
		else
		{   
			throw new WishListException("Product ID not found in Wishlist to REMOVE");
		}
	
	   
		
	}

	@Override
	public HashMap<String, ProductDTO> displayProductInWishlist() {
		// TODO Auto-generated method stub
		return WishlistDaoImpl.wlist ;
	}

	/* public HashMap<String, ProductDTO> displayProductInWishlist() {
	HashMap<String, ProductDTO> list1=WishlistDaoImplObj.displayProductInWishlist();
	return list1;
	
}*/
}
