package com.app.core;

import java.time.LocalDate;

//Book : isbn or title(string) , author(string) , price(double), category(enum) , quantity(int) , publish date(LocalDate)
public class Book {
	private String isbn;
	private String author;
	private double price;
	private Category category;
	private int quantity;
	private LocalDate publishDate;
	public Book(String isbn, String author, double price, Category category, int quantity, LocalDate publishDate) {
		super();
		this.isbn = isbn;
		this.author = author;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
		this.publishDate = publishDate;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", author=" + author + ", price=" + price + ", category=" + category
				+ ", quantity=" + quantity + ", publishDate=" + publishDate + "]";
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getIsbn() {
		return isbn;
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public Category getCategory() {
		return category;
	}
	public LocalDate getPublishDate() {
		return publishDate;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
