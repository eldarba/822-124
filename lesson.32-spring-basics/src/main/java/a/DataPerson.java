package a;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;

@Data
public class DataPerson {

	private int id;
	@Exclude
	private String name;
	@Exclude
	private int age;

}
