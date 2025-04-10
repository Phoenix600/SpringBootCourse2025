package com.pranay.example16.services;

import com.pranay.example16.domain.Book;
import com.pranay.example16.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * File Name: BookServices.java
 * Entity: BookServices
 * Package: com.pranay.example16.services
 * Author: pranayramteke
 * Date: 08/04/25
 * Description:
 */

@Service
public class BookServices
{
	@Autowired
	BookRepository bookRepository;
	

	
	public Book addBook(Book book) {
		return bookRepository.save(book);
	}
	
	public Book getBook(Long id) {
		return bookRepository.findById(id).get();
	}
	
	public List<Book> saveAllBooks(List<Book> books)
	{
		return bookRepository.saveAll(books);
	}
	
	
	public Book patchBook(Long id, Book book)
	{
		Book existingBook = bookRepository.findById(id).get();
		
		if(null != book.getName())
		{
			existingBook.setName(book.getName());
		}
		
		if(null != book.getAuthor())
		{
			existingBook.setAuthor(book.getAuthor());
		}
		
		return bookRepository.save(existingBook);
		
	}
}
