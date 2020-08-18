package org.eldar.spring.dao;

import org.eldar.spring.myAnnotations.MyLogAnnotation;
import org.springframework.stereotype.Component;

@Component
public class CouponDao {

	public void addCoupon() {
		System.out.println(getClass() + ": add coupon to db");
	}

	@MyLogAnnotation
	public boolean doWork() {
		System.out.println(getClass() + ": doing some work");
		return true;
	}

}
