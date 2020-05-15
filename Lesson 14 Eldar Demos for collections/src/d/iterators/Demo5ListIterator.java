package d.iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo5ListIterator {

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
//		Iterator<String> it = listOfNames.iterator();
		ListIterator<String> lit = listOfNames.listIterator();

		while (lit.hasNext()) {
			String curr = lit.next();
			System.out.println(curr);
			if (curr.length() > 3) {
				lit.set("some long name was here");
			}
		}
		System.out.println("================");
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		System.out.println("================");

		// adding elements using ListIterator:
		lit.add("ZZZ");

		System.out.println(listOfNames);

	}
}
