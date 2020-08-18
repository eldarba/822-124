package org.eldar.spring.aopdemo;

import org.eldar.spring.AppConfig;
import org.eldar.spring.beans.Company;
import org.eldar.spring.dao.CompanyDao;
import org.eldar.spring.dao.CouponDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {

			CompanyDao companyDao = ctx.getBean(CompanyDao.class);
			CouponDao couponDao = ctx.getBean(CouponDao.class);

			Company c = ctx.getBean(Company.class);
			System.out.println(c);
			c.setId(101);

			companyDao.addCompany(c, true);
			companyDao.sayHello();
			couponDao.addCoupon();
			couponDao.doWork();
		}

	}

}
