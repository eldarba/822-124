package a.enums.cars;

public class DemoEnumFeatures {

	public static void main(String[] args) {

		CarColor[] colors = CarColor.values(); // array of all constants
		CarColor red = CarColor.RED;
		System.out.println(red + " - " + red.ordinal());

	}

}
