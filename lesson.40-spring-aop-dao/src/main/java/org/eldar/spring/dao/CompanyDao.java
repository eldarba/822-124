package org.eldar.spring.dao;

import org.eldar.spring.beans.Company;
import org.springframework.stereotype.Component;

@Component
public class CompanyDao {

	public void addCompany(Company company, boolean flag) {
		System.out.println(getClass() + ": add company to db");
	}

	public int sayHello() {
		System.out.println(getClass() + ": saying hello");
		return 0;
	}

}
