package com.capgemini.greatoutdoors.service;

import java.util.HashMap;

import com.capgemini.greatoutdoors.dto.ProductDTO;
import com.capgemini.greatoutdoors.exceptions.CancelException;


public interface CancelService {
	public boolean  addToOrder(String pid) throws CancelException;
	public boolean removeProductFromOrder(String pid) throws  CancelException;
	public boolean removeOrder() throws CancelException;
	public HashMap<String, ProductDTO> displayOrder();
}
