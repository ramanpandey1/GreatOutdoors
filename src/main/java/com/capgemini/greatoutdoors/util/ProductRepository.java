package com.capgemini.greatoutdoors.util;



import java.util.HashMap;

import com.capgemini.greatoutdoors.dto.ProductDTO;

public class ProductRepository {
static public  HashMap<String, ProductDTO> productList=new HashMap<String , ProductDTO>(); 
/************* Function To Create Repository for Product *************/
static public void createProductList()
{
	productList.put("P101", new ProductDTO(1,10,"P101","Campling LED headlamp","White","N/A","WaterProof","Adventure Hut",990));
	productList.put("P102", new ProductDTO(1,5,"P102","Straight claw Hammer","Red+Blak","0.48Kg","Camping Hammer","Camping Mania pvt. ltd.",369));
	productList.put("P103", new ProductDTO(1,10,"P103","Locking caranaviner","silver","N/A","N/A","Zincpro pvt. ltd.",249));
	productList.put("P104", new ProductDTO(1,5,"P104","NightScope Vinocular","Grey","12cm X 12cm","UltraClear Vision","Korean Space Tools",1500));
	productList.put("P105", new ProductDTO(1,10,"P105","Tower Climb Kit","white","N/A","Top Quality Kit","Heapro",19050));
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
