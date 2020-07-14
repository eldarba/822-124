package a.types.printers;

import org.springframework.stereotype.Component;

@Component
public class Color implements Ink {

	private int level = 10;

	@Override
	public int getLevel() {
		return this.level;
	}

	@Override
	public void use() {
		if (this.level >= 2) {
			this.level -= 2;
		} else {
			throw new RuntimeException("No enough Ink");
		}

	}

}
