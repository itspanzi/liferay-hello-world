package com.xtivia.samples.books.dao;

import java.util.List;

import com.xtivia.samples.books.model.Book;

public interface BookDAO {

	List<Book> allBooks();
	
	Book getBook(int id);

	boolean addBook(Book book);
	
	boolean deleteBook(int id);

	boolean updateBook(Book book);
}
