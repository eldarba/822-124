package c.sorting.lambda;

import java.util.ArrayList;
import java.util.List;

public class SortingKnownJavaTypesLambda {

	public static void main(String[] args) {

		List<Integer> listOfIntegers = new ArrayList<>();

		listOfIntegers.add(100);
		listOfIntegers.add(20);
		listOfIntegers.add(50);
		listOfIntegers.add(30);
		listOfIntegers.add(10);
		System.out.println(listOfIntegers);

		listOfIntegers.sort(null);
		System.out.println(listOfIntegers);

		listOfIntegers.sort((Integer a, Integer b) -> {
			return b.compareTo(a);
		});
		System.out.println(listOfIntegers);
	}

}
