package app.core.entities;

import java.time.LocalDate;

public class Coupon {

	private LocalDate startDate;

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public static void main(String[] args) {
		Coupon c = new Coupon();
		c.setStartDate(LocalDate.of(1985, 5, 16));
	}

}
