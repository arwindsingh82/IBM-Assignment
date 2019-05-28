package com.ibm.takehome.ui;

import java.util.Scanner;

import com.ibm.takehome.bean.Product;
import com.ibm.takehome.service.Service;



public class Client {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		   Product p = new Product();
			Service s = new Service();
		      	
			 boolean quit = false;

		        do 
		        {		        	
		     System.out.print("Generate Bill by entering Product code and quantity: " + "\ncode" + "\nquntity");
		     String menu = sc.nextLine();
		     menu = menu.toLowerCase();
		     
		     switch (menu)
		     {
		     case "code": 
		    	System.out.println("Enter Product code :"); 
			  int pcode = sc.nextInt();
			  sc.nextLine(); 
			  
			  if(pcode >=1000 && pcode <=9999) {
			  p.setProdCode(pcode);
			  s.display(p);
			  }else {
				  System.out.println("please enter correct product code of 4 digit");
			  }
			  
			  	System.out.println("Enter Product quantity :"); 
				  int pquant = sc.nextInt();
				  sc.nextLine(); 
				  if(pquant > 0) {
					//*********************************
					  }else {
						  System.out.println("please enter product quantity more than one ");
					  }
				  
				  
				  break;
			 
		     case "exit": 
		    	 System.out.println("Thankyou for Shoping !!");
		         quit = true; 
		     }
		 	        }
		     while (!quit);
		
	}

}
