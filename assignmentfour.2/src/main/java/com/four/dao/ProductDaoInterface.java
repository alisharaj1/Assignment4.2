package com.four.dao;

import java.util.List;

import com.four.entity.Product;
import com.four.entity.Previousproduct;


public interface ProductDaoInterface {
	
	public boolean create(Product product);
	public List<Product> retrieve1();
	public List<Previousproduct> retrieve();

}

