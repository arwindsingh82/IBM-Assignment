package com.ibm.takehome.bean;

public class Product {

	
	private int prodCode;
	private int price;
	private String category;
	private String descrip;

	public Product(int prodCode, int price, String category, String descrip) {		
		this.prodCode = prodCode;
		this.price = price;
		this.category = category;
		this.descrip = descrip;
		}
	
	public Product() {		
		
		}
	// getter and setter

	public int getProdCode() {
		return prodCode;
	}

	public void setProdCode(int prodCode) {
		this.prodCode = prodCode;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}


	

	}
	

