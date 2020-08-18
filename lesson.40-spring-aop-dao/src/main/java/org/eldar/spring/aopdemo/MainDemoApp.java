package org.eldar.spring.aopdemo;

import org.eldar.spring.AppConfig;
import org.eldar.spring.dao.CompanyDao;
import org.eldar.spring.dao.CouponDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {

			CompanyDao companyDao = ctx.getBean(CompanyDao.class);
			CouponDao couponDao = ctx.getBean(CouponDao.class);

			companyDao.addCompany();
			companyDao.sayHello();
			couponDao.addCoupon();
			couponDao.doWork();
		}

	}

}
