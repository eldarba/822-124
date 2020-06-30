package c;

public class Tar1 {

	// O(1)

	public static boolean isFirstElementNull(Object[] arr) {
		return arr[0] == null;
	}

	public static void main(String[] args) {
		boolean b;
		b = isFirstElementNull(new Object[] { null, "aaa", "bbb" });
		System.out.println(b);
		b = isFirstElementNull(new Object[] { "ccc", null, "aaa", "bbb" });
		System.out.println(b);
	}

}
