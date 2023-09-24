package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repo.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void saveProductInfo(Product product) {
		// TODO Auto-generated method stub
		System.out.println("In servive Layer  : " + product);
		productRepository.save(product);
	}

	@Override
	public List<Product> getAllProductDetails() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

}
