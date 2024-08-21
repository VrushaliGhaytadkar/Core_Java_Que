package com.training.examples.q1;

public class Product {
	
	    private int id;
	    private String name;
	    private double price;

	    public Product(int id, String name, double price) {
	        this.id = id;
	        this.name = name;
	        this.price = price;
	    }

	    
	    public void displayProduct() {
	        System.out.println("Product_ID: " + id);
	        System.out.println("Product_Name: " + name);
	        System.out.println("Product_Price: " + price);
	    }
	    
	    public static void main(String[] args) {
	      
	        Product product = new Product(1, "TV", 10900);	        
	        product.displayProduct();
	    }
	

}
