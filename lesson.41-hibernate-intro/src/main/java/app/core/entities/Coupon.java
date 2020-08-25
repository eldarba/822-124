package app.core.entities;

import java.time.LocalDate;

public class Coupon {

	private LocalDate startDate;

	public Coupon(LocalDate startDate) {
		super();
		this.startDate = startDate;
	}

	public Coupon() {
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	// main sample
	public static void main(String[] args) {
		Coupon c = new Coupon();
		c.setStartDate(LocalDate.of(1985, 5, 16));

		Coupon c2 = new Coupon(LocalDate.of(2020, 4, 25));
	}

}
