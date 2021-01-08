package proxy;

import java.util.HashMap;
import java.util.Map;

public class CapitalizerCachProxy implements Capitalizer {

	private Map<String, String> cach = new HashMap<String, String>();
	private Capitalizer capitalizer = new ConcreteCapitalizer();

	@Override
	public String modify(String text) {
		String value = cach.get(text);
		if (value != null) {
			// if we already have the answer in the cache do not use the resource
			return value;
		} else {
			// if we do not have the answer in the cache use the resource
			value = capitalizer.modify(text);
			cach.put(text, value);
			return value;
		}
	}

}
