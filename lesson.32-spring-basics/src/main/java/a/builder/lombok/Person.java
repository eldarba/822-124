package a.builder.lombok;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Person {

	private int id;
	private String name;
	private int age;
	
	
	

}
