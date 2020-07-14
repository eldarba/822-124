package a.types.cars;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SimpleHonker implements Honker {

	@Override
	public String honk() {
		return "bip bip";
	}

}
