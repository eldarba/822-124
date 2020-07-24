package org.eldar.spring.persons;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component("person")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Getter
@Setter
@ToString
public class Person {

	private int id;
	private String name;
	@Value("${person.default.age: 20}")
	private int age;
}
