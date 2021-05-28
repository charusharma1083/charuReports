package com.ekart;

import java.util.List;

public interface ProductService {

	
	public boolean addProduct(Product p);
	public List<Product> getAllProducts();
	
	public Product deleteProduct(int id);
	
	public boolean updateProduct(Product p);
	
		
}
