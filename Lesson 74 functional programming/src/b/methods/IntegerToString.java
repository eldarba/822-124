package b.methods;

import java.util.function.Function;

public class IntegerToString implements Function<Integer, String> {

	@Override
	public String apply(Integer val) {
		return val.toString();
	}

	public static void main(String[] args) {
		Function<Integer, String> f = new IntegerToString();
		String str = f.apply(8);
		System.out.println(str);
	}

}
