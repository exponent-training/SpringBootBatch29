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
	public void addProductData(Product product) {
		// TODO Auto-generated method stub
		System.out.println("In Service layer : " + product);
		productRepository.save(product);
	}

	@Override
	public List<Product> getAllData() {
		// TODO Auto-generated method stub
		List<Product> plist = (List<Product>)productRepository.findAll();
		return plist;
	}

	@Override
	public Product getProductUsingLogin(String uname, String pass) {
		// TODO Auto-generated method stub
		Product product = productRepository.findByUnameAndPass(uname, pass);
		return product;
	}

	
}
