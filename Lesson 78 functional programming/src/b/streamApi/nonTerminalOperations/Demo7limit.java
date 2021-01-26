package b.streamApi.nonTerminalOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo7limit {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("One");
		list.add("One");
		list.add("Two");
		list.add("Two");
		list.add("Three");

		// limit is a non-terminal operation that will limit the number of elements in
		// the stream
		Stream<String> stream = list.stream().limit(3);

		// collect is a terminal operation - starts iteration and processing
		List<String> uniqueList = stream.collect(Collectors.toList());

		System.out.println(list);
		System.out.println(uniqueList);

	}

}
