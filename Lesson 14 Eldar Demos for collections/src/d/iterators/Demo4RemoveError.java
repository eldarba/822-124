package d.iterators;

import java.util.ArrayList;
import java.util.List;

public class Demo4RemoveError {

	public static void main(String[] args) {

		// create list
		List<String> listOfNames = new ArrayList<>();

		// populate with elements
		listOfNames.add("Dan");
		listOfNames.add("Ran");
		listOfNames.add("Ann");
		listOfNames.add("Alexander");
		listOfNames.add("Jenifer");

		System.out.println(listOfNames);

		for (int i = 0; i < listOfNames.size(); i++) {
			String currElement = listOfNames.get(i);
			System.out.println(currElement);

			if (currElement.length() > 3) {
				listOfNames.remove(i); // logical index error
			}
		}

		System.out.println(listOfNames);
	}
}
