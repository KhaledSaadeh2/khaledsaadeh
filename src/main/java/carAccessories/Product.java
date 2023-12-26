package carAccessories;

import java.util.ArrayList;

import java.util.logging.Logger;


public class Product {
	
	
	  Logger logger = Logger.getLogger(getClass().getName());

    private String productId;
    private String name;
    private String descriptions;
    private ArrayList<String> images;
    private double price;
    private boolean isAvailable;

	public Product() {
		this.productId = generateProductId();
		this.name = "";
//		this.category = "";	
		this.descriptions = "";
	    this.images = new ArrayList<String>();
	     this.price = 0.0;
	     this.isAvailable = false;
	            
	}
 void print() {
		//System.out.println(i+1 + ". " + product.getName() + " - " + product.getPrice() + " - " +( product.isAvailable() ? "In Stor" : "Out Of Stor" )+ " - "  + product.getDescriptions());
	 logger.info("Product Name: " + name + " - " + "Product Price: " + price + " - " + "Product Availability: " + (isAvailable ? "In Stock" : "Out Of Stock" )+ " - "  + "Product Description: " + descriptions);
 }

	public Product(String name, String descriptions, ArrayList<String> images, double price,
			boolean isAvailable) {
		this.name = name;
//		this.category = category;
		this.descriptions = descriptions;
		this.images = images;
		this.price = price;
		this.isAvailable = isAvailable;
		this.productId = generateProductId();
	}

    
//    public Product(String name, String category, Double price, boolean isAvailable) {
//        this.productId = generateProductId(); 
//        this.name = name;
////        this.category = category;
//        this.price = price;
//        this.isAvailable = isAvailable;
//		this.productId = generateProductId();
//    }

   // get description
    public String getDescriptions() {
    	        return descriptions;
    }
    private String generateProductId() {
        return Long.toString(System.currentTimeMillis());
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

//    public String getCategory() {
//        return category;
//    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

	public void setName(String name) {
		this.name = name;
	}
    

    
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
