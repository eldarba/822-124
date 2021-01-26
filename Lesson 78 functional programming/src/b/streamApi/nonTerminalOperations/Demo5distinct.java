package b.streamApi.nonTerminalOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo5distinct {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("One");
		list.add("One");
		list.add("Two");
		list.add("Two");
		list.add("Three");

		// distinct is a non-terminal operation
		Stream<String> stream = list.stream().distinct();

		// forEach is a terminal operation - starts iteration and processing
		stream.forEach(e -> System.out.println(e));

		System.out.println(list);

	}

}
