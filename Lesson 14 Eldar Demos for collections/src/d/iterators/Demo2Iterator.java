package d.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo2Iterator {

	public static void main(String[] args) {

		// create list
		List<String> listOfNames = new ArrayList<>();

		// populate with elements
		listOfNames.add("Dan");
		listOfNames.add("Ran");
		listOfNames.add("Ann");
		listOfNames.add("Alexander");
		listOfNames.add("Jenifer");

		// get an iterator for the list
		Iterator<String> it = listOfNames.iterator();

		// check if the iterator has an element
		if (it.hasNext())
			// get the element from the iterator and print it
			System.out.println(it.next());

		// and do it over and over again
		if (it.hasNext())
			System.out.println(it.next());
		if (it.hasNext())
			System.out.println(it.next());
		if (it.hasNext())
			System.out.println(it.next());
		if (it.hasNext())
			System.out.println(it.next());
		if (it.hasNext())
			System.out.println(it.next());
		if (it.hasNext())
			System.out.println(it.next());
		if (it.hasNext())
			System.out.println(it.next());
		if (it.hasNext())
			System.out.println(it.next());
		//

		if (it.hasNext()) {
			System.out.println(it.next());
		} else {
			System.out.println("the iterator found no more elements in the collection");
		}

		// can you do it with a loop?

	}
}
