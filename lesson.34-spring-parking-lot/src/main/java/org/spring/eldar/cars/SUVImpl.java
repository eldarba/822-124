package org.spring.eldar.cars;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component("suv")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@ToString @Getter @Setter
public class SUVImpl implements SUV {
	
	private int number;

	@Override
	public int getNumber() {
		return this.number;
	}

	@Override
	public void start() {
		System.out.println("SUV start engine");

	}

	@Override
	public void stop() {
		System.out.println("SUV stop engine");

	}

	@Override
	public void set4wd() {
		System.out.println("SUV 4X4");
		
	}

}
