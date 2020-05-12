package c.collections;

import java.util.HashMap;
import java.util.Map;

public class Demo4Map {

	public static void main(String[] args) {

		/*
		 * create a dictionary with the following definitions
		 * 
		 * table - a furniture for writing or eating
		 * 
		 * dog - a nice animal
		 *
		 * java - a programming language
		 * 
		 * and print it
		 */

		Map<Character, Integer> mapUnicode = new HashMap<>();

		mapUnicode.put('C', 67);
		mapUnicode.put('B', 66);
		mapUnicode.put('A', 65);
		mapUnicode.put('D', 68);

		System.out.println(mapUnicode);

		System.out.println(mapUnicode.get('C'));
		System.out.println(mapUnicode.get('Z'));

	}

}
