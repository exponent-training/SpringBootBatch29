package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "/")
	public String getIndex() {
		return "index";
	}
	
	@RequestMapping(value = "/reg")
    public String saveProductData(@ModelAttribute Product product) {
		System.out.println("Product Data : " +product);
		productService.addProductData(product);
		return "index";
	}
	
	@RequestMapping(value = "/getAll")
	public String getAllData(Model model) {
		List<Product> list = productService.getAllData();
		model.addAttribute("plist", list);
		return "success";
	}
	
	@RequestMapping(value = "/log")
	public String getLoginData(@RequestParam String uname,@RequestParam String pass,Model model) {
		System.out.println("Login Data : " + uname + " " + pass);
		Product product1 = productService.getProductUsingLogin(uname, pass);
		model.addAttribute("product", product1);
		return "successone";
	}
	
}
