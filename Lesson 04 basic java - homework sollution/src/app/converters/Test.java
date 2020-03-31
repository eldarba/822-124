package app.converters;

/**
 * converter test
 * 
 * @author Eldar
 *
 *
 */
public class Test {

	/**
	 * create a converter and convert 5.0 celsius to fahrenheit (should be 41) and
	 * then 41 fahrenheit to celsius (should be 5)
	 */
	public static void main(String[] args) {

		MyConverter converter = new MyConverter();
		double celsius = 5;
		double fahrenheit = 41;

		System.out.println(celsius + " celsius is " + converter.celsiusToFahrenheit(celsius) + " fahrenheit");
		System.out.println(fahrenheit + " fahrenheit is " + converter.fahrenheitToCelsius(fahrenheit) + " celsius");
	}

}
