package org.eldar.spring.persons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component("person") // default to class name start with low case letter
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Getter
@Setter
@ToString
public class Person {

	private int id;
	private String name;
	private int age;

	public Person() {
	}

	@Autowired
	public Person(@Value("${person.default.id: -1}") int id, @Value("${person.default.name: default_name}") String name,
			@Value("${person.default.age: 20}") int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

//	@Autowired
//	public void setId(@Value("888") int id) {
//		this.id = id;
//	}

}

// bean life cycle
// 1. fields initialized to default values
// 2. fields initialized to assigned values [id = 111]
// 3. fields initialized by ctor [@Value]
// 4. fields initialized by @Value on fields 
// 5. fields initialized by @Value on set methods 
