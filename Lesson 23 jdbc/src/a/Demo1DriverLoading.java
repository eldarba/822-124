package a;

public class Demo1DriverLoading {
	
	public static void main(String[] args) {
		/*
		 * loading the driver means loading the driver class
		 * 
		 * loading a driver class to memory happens on the first time we use that class
		 * 
		 * the jdbc driver class is in the database jar files
		 * */
		
		String driverName = "org.apache.derby.jdbc.ClientDriver";
		
		try {
			// use Class.forName to load drivers because it is configurable
			Class.forName(driverName);
			System.out.println(driverName + " loaded " + driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
