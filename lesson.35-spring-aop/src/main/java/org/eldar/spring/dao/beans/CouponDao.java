package org.eldar.spring.dao.beans;

import org.springframework.stereotype.Component;

@Component
public class CouponDao {
	
	public void addCoupon() {
		System.out.println(getClass() + ": add coupon to db");
	}
	
	public boolean doWork() {
		System.out.println(getClass() + ": doing some work");
		return true;
	}

}
