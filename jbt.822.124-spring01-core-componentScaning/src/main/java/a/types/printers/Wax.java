package a.types.printers;

import org.springframework.stereotype.Component;

@Component
public class Wax implements Ink {

	private int level = 10;

	@Override
	public int getLevel() {
		return this.level;
	}

	@Override
	public void use() {
		if (this.level >= 3) {
			this.level -= 3;
		} else {
			throw new RuntimeException("Empty");
		}

	}

}
