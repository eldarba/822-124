package a;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter @Setter
public class Person {
	
	private int id;
	private String name;
	private int age;
	

}
