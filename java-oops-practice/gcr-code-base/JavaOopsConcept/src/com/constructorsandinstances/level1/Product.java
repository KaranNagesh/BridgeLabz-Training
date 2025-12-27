package com.constructorandinstance.level1;

public class Product {
	String productName;
	double price;

	static int totalProducts;
	
	Product(String productName , double price,int totalProducts){
		this.productName = productName;
		this.price = price;	
		 this.totalProducts =  totalProducts;
	}
	
	public void displayProductDetails(){
		System.out.println("Name : "+productName);
		System.out.println("Price : "+price);
	}
	public void displayTotalProducts(){
		System.out.println("total product is : "+totalProducts);
	}
	
	public static void main(String[] args) {
		 Product p = new Product("parle-g", 10.0,1);
		 p.displayProductDetails();
		 p.displayTotalProducts();

	}

}
