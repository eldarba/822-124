package a;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethods {
	public static void main(String[] args) {

		Collection<String> col = new ArrayList<>();

		// add
		col.add("AAA");
		col.add("BBB");
		col.add("CCC");

		// contains
		boolean b = col.contains("BBB");

		// isEmpty
		b = col.isEmpty();

		// remove
		b = col.remove("BBB");

		// size
		int size = col.size();

		// toArray
		Object[] arr1 = col.toArray();
		String[] arr2 = col.toArray(new String[] {});

		// clear
		col.clear();

	}
}
