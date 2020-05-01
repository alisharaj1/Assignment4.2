package com.four.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.four.dao.ProductDao;
import com.four.entity.Product;
import com.four.entity.Previousproduct;

@Service
public class ProductService implements ProductServiceInterface {
	@Autowired
	ProductDao productDao;

	@Override
	public Product save(Product product) {
		boolean result = productDao.create(product);

		if (result) {
			return product;
		} else
			return null;
	}

	@Override
	public List<Previousproduct> reterive() {
		List<Previousproduct> listproductold = new ArrayList<>();
		
		for (Product product : productDao.retrieve1()) {
			Previousproduct pp = new Previousproduct();
			pp.setProdId(product.getProdId());
			pp.setProdName(product.getProdName());
			pp.setProdPrice(product.getProdPrice());

			listproductold.add(pp);
	}
		return listproductold;
		}

	@Override
	public List<Product> reterivev1() {
		return productDao.retrieve1();
	}
}

