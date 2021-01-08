package proxy;

public class Main {

	public static void main(String[] args) {

		String[] codes = { "delta", "alfa", "venus", "rome" };

		Capitalizer cap = new CapitalizerCachProxy();

		int r;

		for (int i = 0; i < 100; i++) {
			r = (int) (Math.random() * codes.length);
			System.out.println(cap.modify(codes[r]));
		}

	}

}
