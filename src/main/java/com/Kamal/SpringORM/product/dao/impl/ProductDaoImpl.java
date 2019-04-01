package com.Kamal.SpringORM.product.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.Kamal.SpringORM.product.dao.ProductDao;
import com.Kamal.SpringORM.product.model.Product;

@Component("productDaoImpl")
public class ProductDaoImpl implements ProductDao{

	@Autowired
	HibernateTemplate ht;
	
	@Override
	@Transactional
	public int create(Product product) {
		Integer result = (Integer)ht.save(product);
		return result;
	}

	@Override
	@Transactional
	public void update(Product product) {
		ht.update(product);
		
		
	}

	@Override
	@Transactional
	public void delete(Product product) {
		ht.delete(product);
		
	}

	@Override
	@Transactional
	public Product find(int id) {
		Product product = ht.get(Product.class, id);
		return product;
	}

	@Override
	public List<Product> findall() {
		List<Product> loadAll = ht.loadAll(Product.class);
		return loadAll;
	}

}
