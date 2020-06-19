package b.homework;

import java.sql.Date;

public class Book {
	
	private int id;
	private String title;
	private String author;
	private Date publication;
	private double price;
	private int quantity;
	private double rating;
	
	public Book() {
	}

	public Book(int id) {
		super();
		this.id = id;
	}

	public Book(int id, String title, String author, Date publication, double price, int quantity, double rating) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.publication = publication;
		this.price = price;
		this.quantity = quantity;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getPublication() {
		return publication;
	}

	public void setPublication(Date publication) {
		this.publication = publication;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publication=" + publication
				+ ", price=" + price + ", quantity=" + quantity + ", rating=" + rating + "]";
	}
	
	
	
	

}
