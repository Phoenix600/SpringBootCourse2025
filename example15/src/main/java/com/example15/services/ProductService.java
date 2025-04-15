package com.example15.services;

import com.example15.domain.Product;
import com.example15.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * File Name: ProductService.java
 * Entity: ProductService
 * Package: com.example15.services
 * Author: pranayramteke
 * Date: 11/04/25
 * Description:
 */

@Service
public class ProductService
{
	@Autowired
	ProductRepository productRepository;
	
	public Product findProductByName(String name)
	{
		return productRepository.findByName(name);
	}
	
	public List<Product> findProductBySku(String sku) {
		return productRepository.findBySku(sku);
	}
	
	public List<Product> findProductsByPrice(Double price)
	{
		return productRepository.findByPrice(price);
	}
	
	
	public List<Product> findProductByNameAndPrice(String name,Double price)
	{
		return productRepository.findByNameOrPrice(name,price);
	}
	
	
	
}
