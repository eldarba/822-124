package e.enumrations;

import java.util.Enumeration;
import java.util.Vector;

public class Demo1 {
	public static void main(String[] args) {

		Vector<String> vector = new Vector<>();
		vector.add("aaa");
		vector.add("bbb");
		vector.add("ccc");
		System.out.println(vector);

//		get an enumeration of the vector (List)
		Enumeration<String> en = vector.elements();

		while (en.hasMoreElements()) {
			String curr = en.nextElement();
			System.out.println(curr);
		}
	}
}
