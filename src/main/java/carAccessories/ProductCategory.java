package carAccessories;

import java.util.ArrayList;
import java.util.List;

import java.util.logging.Logger;


public class ProductCategory {
	
	  Logger logger = Logger.getLogger(getClass().getName());

    private String name;
    private String description;
    private List<Product> products;

    public ProductCategory(String name) {
        this.name = name;
        this.description = "";
        this.products = new ArrayList<>();
    }
    public ProductCategory(String name,String description) {
        this.name = name;
        this.description = description;
        this.products = new ArrayList<>();
    }
	public void addProduct(Product product) {
		products.add(product);
	}
	public List<Product> getProducts() {
    	return products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {    	
        return description;
    }
	public List<Product> getAllProducts() {
			return products;
	}
    public void setDescription(String description) {
        this.description = description;
    }

	public void printProducts() {
		int i = 0;
		for (Product product : products) {
			logger.info(i+". ");
			product.print();
			i++;
		}
		
	}

}
