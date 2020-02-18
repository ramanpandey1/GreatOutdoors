package com.capgemini.greatoutdoors.dao;

import java.util.HashMap;
import com.capgemini.greatoutdoors.dto.ProductDTO;
import com.capgemini.greatoutdoors.util.ProductRepository;

public class WishlistDaoImpl implements WishlistDao {
	public static  HashMap<String, ProductDTO> wlist=new HashMap<String , ProductDTO>(); 
	
/******************* This function will add the specified product to Wishlist **********************/
	
	public boolean addProductToWishlist(String productId) {
		// TODO Auto-generated method stub
	    wlist.put(productId,ProductRepository.productList.get(productId));
		return true;
	}

/******************** This function will remove the specified product from Wishlist ********************/ 
	public boolean removeProductFromWishlist(String productId) {
		// TODO Auto-generated method stub
		wlist.remove(productId);
		return true;
	}

/******************** This function will return the wishlist ********************/
	public HashMap<String, ProductDTO> displayProductInWishlist() {
		// TODO Auto-generated method stub
		return wlist;
	}


}
