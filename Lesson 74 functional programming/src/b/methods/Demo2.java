package b.methods;

import java.util.Arrays;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("gold", "silver", "bronze");
		System.out.println(list);

		list.sort(null);
		System.out.println(list);

		list.sort((String a, String b) -> b.compareTo(a));
		System.out.println(list);
	}

}
