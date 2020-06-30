package a;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class Demo1DriverLoading {

	public static void main(String[] args) {

		Enumeration<Driver> d = DriverManager.getDrivers();
		while (d.hasMoreElements()) {
			System.out.println(d.nextElement());
		}
		/*
		 * loading the driver means loading the driver class
		 * 
		 * loading a driver class to memory happens on the first time we use that class
		 * 
		 * the jdbc driver class is in the database jar files
		 */

		// older version
		// String driverName = "org.apache.derby.jdbc.ClientDriver";

		// newer version
		String driverName = "org.apache.derby.client.ClientAutoloadedDriver";

		try {
			// use Class.forName to load drivers because it is configurable
			Class.forName(driverName);
			System.out.println(driverName + " loaded " + driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
