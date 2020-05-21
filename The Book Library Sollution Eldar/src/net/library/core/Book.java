package net.library.core;

import java.time.LocalDate;

public class Book {

	// attributes
	private String name;
	private String author;
	/** must be non-negative and before or equal to current year */
	private int year;
	/** must be non-negative */
	private int pages;

	// constants
	public static final int MIN_YEAR = 0;
	public static final int MIN_PAGES = 0;
	public static final int MAX_YEAR = LocalDate.now().getYear();

	// CTOR 1
	public Book() {
	}

	// CTOR 2
	public Book(String name, String author, int year, int pages) {
		super();
		set(name, author, year, pages);
	}

	public void set(String name, String author, int year, int pages) {
		this.name = name;
		this.author = author;
		setYear(year);
		setPages(pages);
	}

	public boolean isEmpty() {
		return this.author == null && this.name == null && this.pages == 0 && this.year == 0;
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year >= MIN_YEAR && year <= MAX_YEAR) {
			this.year = year;
		}
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		if (pages >= MIN_PAGES) {
			this.pages = pages;
		}
	}

	@Override
	public String toString() {
		if (isEmpty()) {
			return "empty book";
		} else {
			return "Book Name: " + name + ". " + pages + " pages. Year: " + year;
		}
	}

	/** print this book details if the book is not empty */
	public void print() {
		if (!isEmpty()) {
			System.out.println(this);
		}
	}

}
