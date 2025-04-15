package com.example15.controller;

import com.example15.domain.Product;
import com.example15.services.ProductService;
import jakarta.websocket.server.PathParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * File Name: ProductController.java
 * Entity: ProductController
 * Package: com.example15.controller
 * Author: pranayramteke
 * Date: 11/04/25
 * Description:
 */

@RestController
@RequestMapping("/product")
public class ProductController
{
	@Autowired
	ProductService productService;
	
	// GET http://localhost:8080/product/getProductByName/{name}
	@GetMapping("/getProductByName/{name}")
	public Product getProductByName(@PathVariable("name") String name)
	{
		return productService.findProductByName(name);
	}
	
	@GetMapping("/getProductBySku/{sku}")
	public List<Product> getProductBySku(@PathVariable("sku") String sku)
	{
		return productService.findProductBySku(sku);
	}
	
	@GetMapping("/getProductByPrice")
	// GET http://localhost:8080/product/getProductByPrice?price=499;
	public List<Product> getProductByPrice(@PathParam("price") Double price)
	{
		return productService.findProductsByPrice(price);
	}
	
	// GET http://localhost:8080/product/getProductByNameOrPrice?name={data}&price={data};
	// http://localhost:8080/product/getProductByNameOrPrice?name=White LED Bulb&price=499
	@GetMapping("/getProductByNameOrPrice")
	public List<Product> getProductByNameOrPrice(@PathParam("name") String name,@PathParam("price") Double price)
	{
		return productService.findProductByNameAndPrice(name,price);
	}
	
}
