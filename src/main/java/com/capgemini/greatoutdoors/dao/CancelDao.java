package com.capgemini.greatoutdoors.dao;

import java.util.HashMap;

import com.capgemini.greatoutdoors.dto.ProductDTO;

public interface CancelDao {
public boolean  addToOrder(String pid);
public boolean removeProductFromOrder(String pid);
public boolean removeOrder();
public HashMap<String, ProductDTO> displayOrder();

}
