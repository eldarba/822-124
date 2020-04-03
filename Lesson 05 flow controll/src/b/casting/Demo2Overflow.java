package b.casting;

public class Demo2Overflow {
	/*
	 * What is overflow:
	 * 
	 * An overflow is a corruption of a value when attempting to go beyond the scope
	 * of its type. For example: trying to assign the value 500 to a byte (which has
	 * an upper limit of 127)
	 * 
	 */

	public static void main(String[] args) {

		{
			/*
			 * Explicit casting: the casting operator is needed as a precaution since the
			 * result might differ from the original value.
			 */
			int a = 500;
			byte b = (byte) a; // explicit casting from int to byte. 500 cannot be represented as byte.
			System.out.println(b);
		}
		
		{
			// another example
			double a = 10.25;
			int b = (int) a;
			System.out.println(b);
		}
	}

}
