package com.four.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.four.entity.Product;
import com.four.entity.Previousproduct;

@Transactional
@Repository
public class ProductDao implements ProductDaoInterface {

	@PersistenceContext
	EntityManager em;

	@Override
	public boolean create(Product product) {
		em.persist(product);
		return true;
	}

	@Override
	public List<Product> retrieve1() {
		String Qstr = "SELECT product FROM Product product";
		TypedQuery<Product> query = em.createQuery(Qstr, Product.class);

		return query.getResultList();
	}

	@Override
	public List<Previousproduct> retrieve() {
		String str = "SELECT productld FROM ProductOld productld";
		TypedQuery<Previousproduct> query1 = em.createQuery(str, Previousproduct.class);

		return query1.getResultList();	}
	}