package com.capgemini.greatoutdoors.service;

import java.util.HashMap;

import com.capgemini.greatoutdoors.dto.ProductDTO;
import com.capgemini.greatoutdoors.exceptions.WishListException;

public interface WishlistService {
	public boolean addProductToWishlist(String productId) throws WishListException;
	public boolean removeProductFromWishlist (String productId) throws WishListException;
	public HashMap<String, ProductDTO> displayProductInWishlist();
}
