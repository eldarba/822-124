package a;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class Demo1LoadJdbcDriver {

	public static void main(String[] args) {

		// DriverManager is a class in Java that handles drivers
		// this code will help us see the currently available JDBC drivers
		Enumeration<Driver> drivers = DriverManager.getDrivers();

		System.out.println("=== drivers List ===");
		while (drivers.hasMoreElements()) {
			System.out.println(drivers.nextElement());
		}

	}

}
