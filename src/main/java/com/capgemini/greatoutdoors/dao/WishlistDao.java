package com.capgemini.greatoutdoors.dao;

import java.util.HashMap;

import com.capgemini.greatoutdoors.dto.ProductDTO;

public interface WishlistDao {
	public boolean addProductToWishlist(String productId);
	public boolean removeProductFromWishlist (String productId);
	public HashMap<String, ProductDTO> displayProductInWishlist();
	
}
