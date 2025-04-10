package com.pranay.example16.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * File Name: Book.java
 * Entity: Book
 * Package: com.pranay.example16.domain
 * Author: pranayramteke
 * Date: 08/04/25
 * Description:
 */

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String author;
	
	public Book() {
	}
	
	public Book(Long id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book{" +
				"id=" + id +
				", name='" + name + '\'' +
				", author='" + author + '\'' +
				'}';
	}
}
