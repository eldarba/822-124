package a.composition;

import java.util.function.Function;

public class Demo2Function {

	public static void main(String[] args) {

		{ // compose
			Function<Integer, Integer> add = val -> val + 5;
			Function<Integer, Integer> mul = val -> val * 2;

			// first add then multiply
			Function<Integer, Integer> addThenMul = mul.compose(add);
			int res = addThenMul.apply(10);
			System.out.println(res);

			// first multiply then add
			Function<Integer, Integer> mulThenAdd = add.compose(mul);
			int res2 = mulThenAdd.apply(10);
			System.out.println(res2);
		}

		{ // andThen
			Function<Integer, Integer> add = val -> val + 5;
			Function<Integer, Integer> mul = val -> val * 2;

			// first add then multiply
			Function<Integer, Integer> addThenMul = add.andThen(mul);
			int res = addThenMul.apply(10);
			System.out.println(res);

			// first multiply then add
			Function<Integer, Integer> mulThenAdd = mul.andThen(add);
			int res2 = mulThenAdd.apply(10);
			System.out.println(res2);
		}

	}

}
