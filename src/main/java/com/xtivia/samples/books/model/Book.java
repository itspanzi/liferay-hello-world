package com.xtivia.samples.books.model;

public class Book {

	private final int id = -1;
	private final String title;
	private final String isbn;
	private final String author;
	private final String summary;
	
	public Book(String title, String isbn, String author, String summary) {
		this.title = title;
		this.isbn = isbn;
		this.author = author;
		this.summary = summary;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getAuthor() {
		return author;
	}

	public String getSummary() {
		return summary;
	}
}
