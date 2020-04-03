package b.casting;

public class Demo1 {
	/*
	 * What is casting:
	 * 
	 * Casting is an operation of converting from one type to another type.
	 * 
	 * Casting of a primitive value returns the same value represented in the format
	 * of another data type. This might change the value if it cannot be exactly
	 * represented in the new format.
	 * 
	 * Casting an object return a different type of reference to that object.
	 * 
	 */

	public static void main(String[] args) {
		{
			/*
			 * casting to a wider type is IMPLICIT. Any byte value can be represented as
			 * short. No need for the casting operator
			 */
			byte a = 1;
			short b = a; // implicit casting from byte to short
			System.out.println(b);
		}
		{
			/*
			 * casting to a narrower type is EXPLICIT. Not any short value can be represented as
			 * byte. The casting operator is needed
			 */
			short a = 2;
			byte b = (byte) a; // explicit casting from short to short
			System.out.println(b);
		}
		
		// another example
		{
			long a = 3;
			float b = a; // implicit casting (any long can be represented as float)
			System.out.println(b);
		}
		{
			float a = 4.5F; // notice that the suffix F is not casting
			long b = (long) a; // explicit casting (not any float can be represented as long)
			System.out.println(b);
		}
	}

}
