package com.ibm.takehome.dao;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.ibm.takehome.bean.Product;
import com.ibm.takehome.service.Service;


public class CollectionUtil {

	 private static Map<Integer,Product> products = new HashMap<Integer,Product>(); 
	    static {
	    	
		    //Adding values to the HashMap
		    
		    products.put(1001, new Product(1001, 3500, "phone", "Electronics"));
		    products.put(1002, new Product(1002, 35000, "TV", "Electronics"));
		    products.put(1003, new Product(1003, 350, "Bulb", "Electronics"));
		    products.put(1004, new Product(1004, 35, "pen", "Study"));
		    products.put(1005, new Product(1005, 350000, "laptop", "Electronics"));
		    products.put(1021, new Product(1021, 50, "Biscuit", "food"));
		    products.put(1056, new Product(1056, 5937, "shirt", "clothes"));
		
		

	    }

		Product p = new Product();
		Service s = new Service();
		CollectionUtil c = new CollectionUtil();
		
		public void display(Product p) {
			for(Object obj : products.keySet()){
	            Product pro = (Product)obj;
			System.out.println("Product bill  : " + products.get(pro));
			
		}

}






