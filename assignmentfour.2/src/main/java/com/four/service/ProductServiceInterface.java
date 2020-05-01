package com.four.service;

import java.util.List;

import com.four.entity.Product;
import com.four.entity.Previousproduct;


public interface ProductServiceInterface {
	
	public Product save(Product product);

	public List<Previousproduct> reterive();
	public List<Product> reterivev1();

}

