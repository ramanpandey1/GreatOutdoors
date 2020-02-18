package com.capgemini.greatoutdoors.util;



import java.util.HashMap;

import com.capgemini.greatoutdoors.dto.ProductDTO;

public class ProductRepository {
static public  HashMap<String, ProductDTO> productList=new HashMap<String , ProductDTO>(); 
/************* Function To Create Repository for Product *************/
static public void createProductList()
{
	productList.put("P101", new ProductDTO(1,10,"P101","i10","Red","dimension1","spec1","xyz",1000000));
	productList.put("P102", new ProductDTO(1,5,"P102","verna","black","dimension2","spec2","xyz",600000));
	productList.put("P103", new ProductDTO(1,10,"P103","duster","white","dimension1","spec3","xyz",700000));
	productList.put("P104", new ProductDTO(1,5,"P104","swift dezire","black","dimension3","spec1","xyz",500000));
	productList.put("P105", new ProductDTO(1,10,"P105","creta","white","dimension1","spec2","xyz",800000));
}

/************** Function to get the list Of Product **************/
public static HashMap<String, ProductDTO> getProductList() {
	return productList;
}

/************** Function to set the list Of Product **************/
public static void setProductList(HashMap<String, ProductDTO> productList) {
	ProductRepository.productList = productList;
}







	
	
}
