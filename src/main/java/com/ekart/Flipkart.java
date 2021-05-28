package com.ekart;

public class Flipkart {

	private ProductService productService;

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public boolean addProduct(Product p) {

		if (productService.addProduct(p))
			return true;
		else
			return false;

	}

}
