package h.mapExercise;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Tar1 {
	
	public static void main(String[] args) {
		
		System.out.println("number of words: " + args.length);
		System.out.println("the words:");
		System.out.println(Arrays.toString(args));
		
		System.out.println("=================");
		
		Map<String, Integer> map = new TreeMap<>();
		
		for (String word : args) {
			if(!map.containsKey(word)) {
				map.put(word, 1);
			}else {
				map.put(word, map.get(word) + 1);
			}
		}
		
		for (String key : map.keySet()) {
			System.out.println(key + " - " + map.get(key));
		}
		
	}

}
