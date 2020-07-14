package a.types.printers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LaserPrinter implements Printer {

	@Autowired
	@Qualifier("wax")
	private Ink ink;

	@Override
	public void print(String content) {
		ink.use();
		System.out.println("=== Laser Print ===");
		System.out.println("using " + ink);
		System.out.println(content);
		System.out.println("=== ============ ===");
	}

	@Override
	public void clean() {
		System.out.println("laser clean");
	}
}
