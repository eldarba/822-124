package b.streamApi.nonTerminalOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo2ObtainAndProcess {

	public static void main(String[] args) {

		List<String> items = new ArrayList<String>();
		items.add("One");
		items.add("Two");
		items.add("Three");

		// this is how we obtain a stream from a collection
		Stream<String> stream = items.stream();

		// map is a non terminal operation - it adds a listener
		// count is a terminal operation - it iterates over the elements an d counts
		// them
		long count = stream.map(e -> e.toLowerCase()).count();
		System.out.println(count);

		// the elements in the list remains unchanged
		System.out.println(items);

	}

}
