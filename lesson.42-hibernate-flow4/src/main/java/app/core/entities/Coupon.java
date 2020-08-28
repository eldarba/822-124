package app.core.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
