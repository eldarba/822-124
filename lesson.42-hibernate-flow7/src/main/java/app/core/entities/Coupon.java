package app.core.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Coupon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "coupon_id")
	private List<Review> reviews;

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	@JoinTable(name = "customer_coupon", // name of join table
			joinColumns = @JoinColumn(name = "coupon_id"), // name of join column
			inverseJoinColumns = @JoinColumn(name = "customer_id")) // name of inverse join column
	private List<Customer> customers;

	public Coupon() {
	}

	public Coupon(String title) {
		super();
		this.title = title;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public void addReview(Review review) {
		if (this.reviews == null) {
			this.reviews = new ArrayList<Review>();
		}
		this.reviews.add(review);
	}

	@Override
	public String toString() {
		return "Coupon [id=" + id + ", title=" + title + "]";
	}

}
