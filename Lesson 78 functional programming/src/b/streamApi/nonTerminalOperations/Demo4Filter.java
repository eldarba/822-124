package b.streamApi.nonTerminalOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo4Filter {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");

		// obtain a stream from list and append listeners
		// since all operations here are non-terminal there is no processing
		// filter gets a predicate that acts as condition to decide if elements stay
		Stream<String> stream = list.stream().filter(e -> e.length() <= 3);

		// forEach is a terminal operation - starts iteration and processing
		stream.forEach(e -> System.out.println(e));

		System.out.println(list);

	}

}
