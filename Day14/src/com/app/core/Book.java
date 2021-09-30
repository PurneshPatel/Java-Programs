package com.app.core;

import java.time.LocalDate;

public class Book implements Comparable<Book> {
// isbn or title(string) , author(string) , price(double), category(enum) , quantity(int) , publish date(Date)
	private int isbn;
	private String author;
	private double price;
	private Category ctgy;
	private int quantity;
	private LocalDate publish_date;
	
	public Book(int isbn, String author, double price, Category ctgy, int quantity, LocalDate publish_date) {
		super();
		this.isbn = isbn;
		this.author = author;
		this.price = price;
		this.ctgy = ctgy;
		this.quantity = quantity;
		this.publish_date = publish_date;
	}

	public Book(int isbn) {
		super();
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", author=" + author + ", price=" + price + ", ctgy=" + ctgy + ", quantity="
				+ quantity + ", publish_date=" + publish_date + "]";
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("in book equals");
		if (o instanceof Book)
			return this.isbn == ((Book) o).isbn;
		return false;
	}

	@Override
	public int compareTo(Book anotherBook){
		System.out.println("in compareTo");
		if (this.isbn < anotherBook.getIsbn())
			return -1;
		if (this.isbn == anotherBook.getIsbn())
			return 0;
		return 1;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Category getCtgy() {
		return ctgy;
	}

	public void setCtgy(Category ctgy) {
		this.ctgy = ctgy;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public LocalDate getPublish_date() {
		return publish_date;
	}

	public void setPublish_date(LocalDate publish_date) {
		this.publish_date = publish_date;
	}

}	
