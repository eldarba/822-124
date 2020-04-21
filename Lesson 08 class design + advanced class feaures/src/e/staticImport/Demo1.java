package e.staticImport;

// use static import for short code static references
import static java.lang.Math.E;
import static java.lang.Math.PI;
import static java.lang.Math.random;;

public class Demo1 {

	public static void main(String[] args) {

		System.out.println(PI);
		System.out.println(E);
		System.out.println(random());

	}

}
