package com.ekart;

import static org.junit.Assert.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Matchers;

import com.ekart.Flipkart;
import com.ekart.ProductService;

public class FlipkartTest {

	Flipkart flipkart = new Flipkart();

	ProductService ps;

	@Test
	public void testAddProduct() {

		ps = mock(ProductService.class);

		flipkart.setProductService(ps);

		when(flipkart.addProduct(Matchers.any())).thenReturn(true).thenReturn(false);

		assertTrue(flipkart.addProduct(Matchers.any()));
		assertFalse(flipkart.addProduct(Matchers.any()));		
	}
}