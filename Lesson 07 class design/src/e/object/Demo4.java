package e.object;

public class Demo4 {

	public static void main(String[] args) {

		String str1 = "aaa";
		String str2 = "aaa";

		// is it the same string?

		// is it the same object in memory
		System.out.println(str1 == str2);

		// is it the same object logically
		System.out.println(str1.equals(str2));

	}

}
