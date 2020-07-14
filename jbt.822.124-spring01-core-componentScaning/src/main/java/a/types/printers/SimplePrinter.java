package a.types.printers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SimplePrinter implements Printer {

	@Autowired
	private Ink ink;

	@Override
	public void print(String content) {
		ink.use();
		System.out.println("=== Simple Print ===");
		System.out.println("using " + ink);
		System.out.println(content);
		System.out.println("=== ============ ===");
	}

	@Override
	public void clean() {
		System.out.println("simple clean");

	}

}
