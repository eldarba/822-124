package d.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo3IteratorRemove {

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

		// get an iterator for the list
		Iterator<String> it = listOfNames.iterator();

		while (it.hasNext()) {
			String currElement = it.next();
			System.out.println(currElement);

			if (currElement.length() > 3) {
				it.remove();
			}
		}

		System.out.println(listOfNames);
	}
}
