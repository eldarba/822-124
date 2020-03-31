package app.converters;

/**
 * convert values from one system to another
 * @author Eldar
 */
public class MyConverter {

	/**
	 * convert from celsius to fahrenheit
	 * 
	 * @param celsius the temperature value in celsius units
	 * @return the temperature value in fahrenheit units
	 */
	public double celsiusToFahrenheit(double celsius) {
		return (celsius * 9 / 5) + 32;
	}

	/**
	 * convert from fahrenheit to celsius
	 * 
	 * @param fahrenheit the temperature value in fahrenheit units
	 * @return the temperature value in celsius units
	 */
	public double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}

}
