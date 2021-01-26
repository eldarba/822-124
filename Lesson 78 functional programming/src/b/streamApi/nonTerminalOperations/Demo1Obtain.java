package b.streamApi.nonTerminalOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo1Obtain {

	public static void main(String[] args) {

		List<String> items = new ArrayList<String>();
		items.add("one");
		items.add("two");
		items.add("three");

		// this is how we obtain a stream from a collection
		Stream<String> stream = items.stream();

	}

}
