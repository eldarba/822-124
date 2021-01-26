package c.streamApi.terminalOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo3nonMatch {

	public static void main(String[] args) {

		{
			List<String> list = new ArrayList<String>();
			list.add("aaa bbb ccc");
			list.add("-rrr kkk ccc");
			list.add("fff bbb ddd");
			list.add("-aff bbb ddd");

			Stream<String> stream = list.stream();

			// check that no element starts with *
			boolean nonMatch = stream.noneMatch(e -> e.startsWith("*"));
			System.out.println(nonMatch);
		}

	}

}
