package com.example15.repository;

import com.example15.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * File Name: ProductRepository.java
 * Entity: ProductRepository
 * Package: com.example15.repository
 * Author: pranayramteke
 * Date: 11/04/25
 * Description:
 */

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>
{
	//  Custom Query Methods
	Product findByName(String name);
	List<Product> findBySku(String sku);
	
	List<Product> findByPrice(Double price);
	
	List<Product> findByNameOrPrice(String name, Double price);
}
