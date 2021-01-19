package b.methods;

public class Demo1 {

	private int index = 0;

	// pure function
	public int sum(int a, int b) {
		return a + b;
	}

	// non pure function
	public int getNextIndex() {
		return index++;
	}

}
