package com.xtivia.samples.books.dao;

import java.util.ArrayList;
import java.util.List;

import com.xtivia.samples.books.model.Book;

public class InMemoryBookDao implements BookDAO {
	private List<Book> books;
	
	public InMemoryBookDao() {
		books = new ArrayList<Book>();
		books.add(new Book("First Book", "ISBN1", "First Author", "Summary Number 1"));
		books.add(new Book("Second Book", "ISBN1", "First Author", "Summary Number 2"));
		books.add(new Book("Third Book", "ISBN1", "Second Author", "Summary Number 3"));
		books.add(new Book("Fourth Book", "ISBN1", "Third Author", "Summary Number 4"));
		books.add(new Book("Fifth Book", "ISBN1", "Third Author", "Summary Number 5"));
	}

	@Override
	public List<Book> allBooks() {
		return books;
	}

	@Override
	public Book getBook(int id) {
		return books.get(id);
	}

	@Override
	public boolean addBook(Book book) {
		return books.add(book);
	}

	@Override
	public boolean deleteBook(int id) {
		return books.remove(getBook(id));
	}

	@Override
	public boolean updateBook(Book book) {
		int id = book.getId();
		deleteBook(id);
		return addBook(book);
	}
}
