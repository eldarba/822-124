package a.types.cars;

import org.springframework.stereotype.Component;

@Component
public class FancyHonker implements Honker {

	@Override
	public String honk() {
		return "bip bip fancy";
	}

}
