package org.eldar.demo;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class Drivers {

	public static void main(String[] args) {

		Enumeration<Driver> en = DriverManager.getDrivers();

		System.out.println("List of my JDBC drivers");

		while (en.hasMoreElements()) {
			System.out.println(en.nextElement().getClass());
		}

	}

}
