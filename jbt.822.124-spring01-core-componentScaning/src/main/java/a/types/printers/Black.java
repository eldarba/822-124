package a.types.printers;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Black implements Ink {

	private int level = 10;

	@Override
	public int getLevel() {
		return this.level;
	}

	@Override
	public void use() {
		if (this.level > 0) {
			this.level--;
		} else {
			throw new RuntimeException("No Ink");
		}

	}

}
