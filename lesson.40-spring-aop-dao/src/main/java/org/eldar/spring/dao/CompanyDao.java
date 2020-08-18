package org.eldar.spring.dao;

import org.springframework.stereotype.Component;

@Component
public class CompanyDao {
	
	public void addCompany() {
		System.out.println(getClass() + ": add company to db");
	}
	
	public int sayHello() {
		System.out.println(getClass() + ": saying hello");
		return 0;
	}

}
