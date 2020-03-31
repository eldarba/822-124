package e;

public class Test1 {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		double res = c.getCurrentResult();
		System.out.println(res);
		
		double value = 20;
		// method invocation
		c.add(value);
		System.out.println(c.getCurrentResult());
		
		System.out.println(value);
		
	}
}
