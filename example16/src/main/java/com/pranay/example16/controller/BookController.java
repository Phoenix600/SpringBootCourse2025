package com.pranay.example16.controller;

import com.pranay.example16.domain.Book;
import com.pranay.example16.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * File Name: BookController.java
 * Entity: BookController
 * Package: com.pranay.example16.controller
 * Author: pranayramteke
 * Date: 08/04/25
 * Description:
 */


@RestController
@RequestMapping("/api/v1/books")
public class BookController
{
	@Autowired
	BookServices bookServices;
	
	// POST http://localhost:8080/api/v1/books/create
	@RequestMapping("/create")
	public Book createBook(@RequestBody Book book)
	{
		return bookServices.addBook(book);
	}
	
	// GET http://localhost:8080/api/v1/books/1
	@RequestMapping("/{id}")
	public Book getBook(@PathVariable("id") Long id)
	{
		return bookServices.getBook(id);
	}
	
	// POST http://localhost:8080/api/v1/books/saveAll
	@RequestMapping("/saveAll")
	public Iterable<Book> saveAll(@RequestBody List<Book> books)
	{
		return bookServices.saveAllBooks(books);
	}
	
	// PATCH http://localhost:8080/api/v1/books/patch/{id}
	@RequestMapping("/patch/{id}")
	public Book patchBook(@PathVariable("id") Long id,@RequestBody Book book)
	{
		return bookServices.patchBook(id,book);
	}

}
