package com.xtivia.samples.books.model;

import java.util.List;

import com.xtivia.samples.books.dao.BookDAO;

public class BookManager {

	private final BookDAO dao;

	public BookManager(BookDAO dao) {
		this.dao = dao;
	}
	
	public boolean addBook(Book b) {
		return dao.addBook(b);
	}

	public boolean deleteBook(Book b) {
		return dao.deleteBook(b.getId());
	}
	
	public List<Book> allBooks() {
		return dao.allBooks();
	}

	public Book getBook(int id) {
		return dao.getBook(id);
	}
}
