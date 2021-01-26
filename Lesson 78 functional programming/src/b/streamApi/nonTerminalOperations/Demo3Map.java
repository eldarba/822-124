package b.streamApi.nonTerminalOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo3Map {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");

		// obtain a stream from list and append listeners
		// since all operations here are non-terminal there is no processing
		Stream<String> stream = list

				.stream()

				.map(e -> e.toLowerCase())

				.map(e -> e.toUpperCase())

				.map(e -> e.substring(0, 3));

		stream.forEach(e -> System.out.println(e));

	}

}
