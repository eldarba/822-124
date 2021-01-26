package b.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo6collect {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("One");
		list.add("One");
		list.add("Two");
		list.add("Two");
		list.add("Three");

		// distinct is a non-terminal operation
		Stream<String> stream = list.stream().distinct();

		// collect is a terminal operation - starts iteration and processing
		List<String> uniqueList = stream.collect(Collectors.toList());

		System.out.println(list);
		System.out.println(uniqueList);

	}

}
