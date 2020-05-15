package c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapMethods {

	public static void main(String[] args) {

		Map<Integer, String> map = new LinkedHashMap<>();

		// put
		map.put(22, "twentyTwo");
		map.put(2, "Shtaim");
		String oldValue = map.put(2, "Two"); // Overwrite old value
		map.put(3, "Three");
		System.out.println(map.toString());

		// get
		int key = 2;
		String value = map.get(key);
		System.out.println(key + ": " + value);

		// containsKey
		boolean b = map.containsKey(2);
		// containsValue
		b = map.containsValue("Two");
		System.out.println(b);

		// isEmpty
		b = map.isEmpty();

		// keySet
		Set<Integer> setOfKeys = map.keySet();
		// to convert any type of collection to another use the constructor
		List<Integer> listOfKeys = new ArrayList<>(setOfKeys);
		System.out.println(setOfKeys);
		System.out.println(listOfKeys);
		// values
		Collection<String> values = map.values();

		// remove
		System.out.println(map);
		int keyOfMappingToRemove = 2;
		String valueOfRemovedMapping = map.remove(keyOfMappingToRemove);
		System.out.println(map);

		// replace
		String replacedVal = map.replace(3, "Shalosh");
		System.out.println(replacedVal);
		System.out.println(map);

	}

}
