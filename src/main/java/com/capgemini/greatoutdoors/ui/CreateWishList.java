package com.capgemini.greatoutdoors.ui;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map.Entry;
import java.util.Scanner;
import com.capgemini.greatoutdoors.dto.ProductDTO;
import com.capgemini.greatoutdoors.exceptions.CancelException;
import com.capgemini.greatoutdoors.exceptions.WishListException;
import com.capgemini.greatoutdoors.service.CancelServiceImpl;
import com.capgemini.greatoutdoors.service.WishlistServiceImpl;
import com.capgemini.greatoutdoors.util.ProductRepository;

public class CreateWishList {
	 static public WishlistServiceImpl wListobj=new  WishlistServiceImpl();
	 static public CancelServiceImpl cancelobj=new CancelServiceImpl();
	 static Scanner scan=new Scanner(System.in);
	public static void main(String arg[]) throws WishListException
	{
	
	     {
		ProductRepository.createProductList();
	     }
	      HashMap<String , ProductDTO> wishlist=ProductRepository.getProductList();
	
		for(Entry<String, ProductDTO> me:wishlist.entrySet())
	   {
		System.out.println("Product ID: "+me.getKey()+" ,Car Name: "+me.getValue().getProductName()+" , Product Category: "+me.getValue().getProductCategory()+" , Colour: "+me.getValue().getColor()+" , Specification: "+me.getValue().getSpecification()+" , Manufacturer: "+me.getValue().getManufacturer()+" , Price: "+me.getValue().getProductPrice());
	    System.out.println();
	   }
	
     chooseManagement();
  
}
	/**************** This function will ask you to choose your Management ****************/
	
	public static void chooseManagement()
	{
		boolean decision = true;
		while(decision)
		{
			System.out.println("Press 1 for WishList Management System\n");
			System.out.println("Press 2 for Cancel Management System\n");
			int choice=scan.nextInt();
			switch(choice)
			{
			  case 1: wishListManagement();
			        break;
			  case 2: cancelManagement();
			          break;
			   default:
				    System.out.println("Please enter correct choice\n");
				
			}
		}
	}
	
	/******************* This Function  will start the Cancel Management System *******************/
	
	public static void cancelManagement()
	{
		try {
			cancelOperation();
		}catch(CancelException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	/******************* This Function will show you the option to handle Cancel Operations *******************/
	
	private static void cancelOperation() throws CancelException {
		// TODO Auto-generated method stub
		String decisionValue="";
		boolean decision=true;
		 while(decision)
		   {

			System.out.println("Press 1 to insert item in order");
			System.out.println("Press 2 to Remove Product from Order");
			System.out.println("Press 3 to Remove Order");
			System.out.println("Press 4 to display Order");
			int choice;
			
			choice=scan.nextInt();
		    
		   
			switch(choice)
			{
			case 1:  createOrder();
			         break;  
			case 2:  removeProductFromOrder();
			         break;
			case 3: removeOrder();
			        break;
			case 4: displayOrder();
			        break;
			default: System.out.println("WRONG CHOICE");
			}
			System.out.println("Want to Perform more Operation On Order(yes/no)");
			  decisionValue=scan.next();
			  if(decisionValue.equalsIgnoreCase("yes") || decisionValue.equalsIgnoreCase("no"))
			  {
				  if(decisionValue.equalsIgnoreCase("yes"))
				  {
					  decision=true;
				  }
				  else
				  {
					  decision=false;
				  }
			  }
			  else
			  {  boolean check=true;
			     while(check)
			     {
				  System.out.println("Please Enter in yes or no");
				  decisionValue=scan.next();
				  if(decisionValue.equalsIgnoreCase("yes") || decisionValue.equalsIgnoreCase("no"))
				  {
					  if(decisionValue.equalsIgnoreCase("no"))
					  {
						  decision=false;
					  }
					  check=false;
				  }
			     }
			  }
			  
		   }
		
	}
   
 /*********************** This Function will Display you the Order List  ***********************/
	
	private static void displayOrder() { 
		// TODO Auto-generated method stub
		System.out.println("YOUR ORDERLIST\n");
		try
		{
		HashMap<String, ProductDTO>orderlist=cancelobj.displayOrder();
		
		for(Entry<String, ProductDTO> me:orderlist.entrySet())
		{
			System.out.println("Product ID: "+me.getKey()+" ,Car Name: "+me.getValue().getProductName()+" , Product Category: "+me.getValue().getProductCategory()+" , Colour: "+me.getValue().getColor()+" , Specification: "+me.getValue().getSpecification()+" , Manufacturer: "+me.getValue().getManufacturer()+" , Price: "+me.getValue().getProductPrice());
		    System.out.println();
		}
		}
		catch(CancelException e)
		{
			System.out.println(e.getMessage());
		}
	}

/************************* This Function will Remove the Order **************************/
	
	private static void removeOrder() {
		// TODO Auto-generated method stub
		boolean result;
		try {
			result = cancelobj.removeOrder();
			if(result)
			{
				System.out.println("YOUR ORDER HAS BEEN CANCELLED SUCCESSFULLY\n");
			}
		} catch (CancelException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}
  
/**************************** This Function will remove the particular product from Order list ****************************/
	
	private static void removeProductFromOrder() throws CancelException{
		// TODO Auto-generated method stub
		String decisionValue="";
		boolean decision=true;
		   while(decision)
		   {  try {
		      System.out.println("Enter Pid to remove Product from Order");
		      Scanner input=new Scanner (System.in);
		      String removePid=input.nextLine();
		   boolean result=   cancelobj.removeProductFromOrder(removePid);
		     if(result)
		     {
		    	 System.out.println("REMOVED SUCCESSFULLY");
		     }
		   }
		   catch(CancelException e)
		   {
			   System.out.println(e.getMessage());
		   }
		   System.out.println("Want to Remove more Products from Order(yes/no)");
			  decisionValue=scan.next();
			  if(decisionValue.equalsIgnoreCase("yes") || decisionValue.equalsIgnoreCase("no"))
			  {
				  if(decisionValue.equalsIgnoreCase("yes"))
				  {
					  decision=true;
				  }
				  else
				  {
					  decision=false;
				  }
			  }
			  else
			  {  boolean check=true;
			     while(check)
			     {
				  System.out.println("Please Enter in yes or no");
				  decisionValue=scan.next();
				  if(decisionValue.equalsIgnoreCase("yes") || decisionValue.equalsIgnoreCase("no"))
				  {
					  if(decisionValue.equalsIgnoreCase("no"))
					  {
						  decision=false;
					  }
					  check=false;
				  }
			     }
			  }
			  
		 }
		
		
	}

	/************************** This function will create a Order List********************/
	
	private static void createOrder() throws CancelException{
		// TODO Auto-generated method stub
		

		 System.out.println("CREATE ORDER");
		 String decisionValue="";
		 boolean decision=true;
		
		 while(decision)
		 {
			
			  try {
				  System.out.println("Enter ProductID to insert in Order List");
				  scan.nextLine();
			  String pid= scan.nextLine();
			  boolean result=cancelobj.addToOrder(pid);
			  if(result)
			  {
				  System.out.println("Added Successfully");
			  }
			  }
			  catch(CancelException e)
			  {
				System.out.print(e.getMessage());
			  } 
			  System.out.println("Want to Enter more Product in Order(yes/no)");
			  decisionValue=scan.next();
			  if(decisionValue.equalsIgnoreCase("yes") || decisionValue.equalsIgnoreCase("no"))
			  {
				  if(decisionValue.equalsIgnoreCase("yes"))
				  {
					  decision=true;
				  }
				  else
				  {
					  decision=false;
				  }
			  }
			  else
			  {  boolean check=true;
			     while(check)
			     {
				  System.out.println("Please Enter in yes or no");
				  decisionValue=scan.next();
				  if(decisionValue.equalsIgnoreCase("yes") || decisionValue.equalsIgnoreCase("no"))
				  {
					  if(decisionValue.equalsIgnoreCase("no"))
					  {
						  decision=false;
					  }
					  check=false;
				  }
			     }
			  }
			  
			  
		 }
		  
}
	
 /********************** This function will start the WishList Management System*********************/	

	public static void wishListManagement()
	{
		try {
			wishlistOperation();
		} catch (WishListException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
/*********************** This function will show the Operation on WishList ***********************/	
	
	static public void wishlistOperation() throws WishListException
	{ String decisionValue="";
		boolean decision=true;
	   while(decision)
	   {

		System.out.println("Press 1 to insert in Wishlist");
		System.out.println("Press 2 to Remove from Wishlist");
		System.out.println("Press 3 to view Wishlist");
		int choice;
		
		choice=scan.nextInt();
	    
	   
		switch(choice)
		{
		case 1:  createWishlist();
		         break;  
		case 2:  removeFromWishlist();
		         break;
		case 3: display();
		        break;
		default: System.out.println("WRONG CHOICE");
		}
		System.out.println("Want to Perform more Operation On Wishlist(yes/no)");
		  decisionValue=scan.next();
		  if(decisionValue.equalsIgnoreCase("yes") || decisionValue.equalsIgnoreCase("no"))
		  {
			  if(decisionValue.equalsIgnoreCase("yes"))
			  {
				  decision=true;
			  }
			  else
			  {
				  decision=false;
			  }
		  }
		  else
		  {  boolean check=true;
		     while(check)
		     {
			  System.out.println("Please Enter in yes or no");
			  decisionValue=scan.next();
			  if(decisionValue.equalsIgnoreCase("yes") || decisionValue.equalsIgnoreCase("no"))
			  {
				  if(decisionValue.equalsIgnoreCase("no"))
				  {
					  decision=false;
				  }
				  check=false;
			  }
		     }
		  }
		  
		 
	 }
 }
	   
	
	
/************************ This Function will remove the particular Product from Wishlist ************************/
	
	static public void removeFromWishlist() throws WishListException
	{ String decisionValue="";
		boolean decision=true;
		   while(decision)
		   {  try {
		      System.out.println("Enter Pid to remove");
		      Scanner input=new Scanner (System.in);
		      String removePid=input.nextLine();
		   boolean result=   wListobj.removeProductFromWishlist(removePid);
		     if(result)
		     {
		    	 System.out.println("REMOVED SUCCESSFULLY");
		     }
		   }
		   catch(WishListException e)
		   {
			   System.out.println(e.getMessage());
		   }
		   System.out.println("Want to remove more from Wishlist(yes/no)");
			  decisionValue=scan.next();
			  if(decisionValue.equalsIgnoreCase("yes") || decisionValue.equalsIgnoreCase("no"))
			  {
				  if(decisionValue.equalsIgnoreCase("yes"))
				  {
					  decision=true;
				  }
				  else
				  {
					  decision=false;
				  }
			  }
			  else
			  {  boolean check=true;
			     while(check)
			     {
				  System.out.println("Please Enter in yes or no");
				  decisionValue=scan.next();
				  if(decisionValue.equalsIgnoreCase("yes") || decisionValue.equalsIgnoreCase("no"))
				  {
					  if(decisionValue.equalsIgnoreCase("no"))
					  {
						  decision=false;
					  }
					  check=false;
				  }
			     }
			  }
		 }
		
	}
	
/*********************** This function will create the Wishlist ***********************/
	static public void createWishlist() throws WishListException
	{
	
		 System.out.println("CREATE WISHLIST");
		 String decisionValue="";
		 boolean decision=true;
		
		 while(decision)
		 {
			
			  try {
				  System.out.println("Enter ProductID to insert in Wishlist");
				  scan.nextLine();
			  String pid= scan.nextLine();
			  boolean result=wListobj.addProductToWishlist(pid);
			  if(result)
			  {
				  System.out.println("Added Successfully");
			  }
			  }
			  catch(WishListException e)
			  {
				System.out.print(e.getMessage());
			  } 
			  System.out.println("Want to Enter more in Wishlist(yes/no)");
			  decisionValue=scan.next();
			  if(decisionValue.equalsIgnoreCase("yes") || decisionValue.equalsIgnoreCase("no"))
			  {
				  if(decisionValue.equalsIgnoreCase("yes"))
				  {
					  decision=true;
				  }
				  else
				  {
					  decision=false;
				  }
			  }
			  else
			  {  boolean check=true;
			     while(check)
			     {
				  System.out.println("Please Enter in yes or no");
				  decisionValue=scan.next();
				  if(decisionValue.equalsIgnoreCase("yes") || decisionValue.equalsIgnoreCase("no"))
				  {
					  if(decisionValue.equalsIgnoreCase("no"))
					  {
						  decision=false;
					  }
					  check=false;
				  }
			     }
			  }
			  
			 
		 }
		  
}
	
/******************************* This function will display the Wishlist *******************************/
	static public void display()
	{
		System.out.println("YOUR WISHLIST\n");
		
		HashMap<String, ProductDTO>wishlist=wListobj.displayProductInWishlist();
		for(Entry<String, ProductDTO> me:wishlist.entrySet())
		{
			System.out.println("Product ID: "+me.getKey()+" ,Car Name: "+me.getValue().getProductName()+" , Product Category: "+me.getValue().getProductCategory()+" , Colour: "+me.getValue().getColor()+" , Specification: "+me.getValue().getSpecification()+" , Manufacturer: "+me.getValue().getManufacturer()+" , Price: "+me.getValue().getProductPrice());
		    System.out.println();
		}
		
		
	}
}
