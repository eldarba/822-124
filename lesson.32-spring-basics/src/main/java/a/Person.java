package a;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
//@ToString(of = { "name", "age" })
@ToString
@EqualsAndHashCode(of = {"id"})
public class Person {

	private int id;

	@Setter
	@NonNull
	private String name;

	@Setter
	@NonNull
	private int age;

	public static void main(String[] args) {
		Person p = new Person("Aaa", 25);
		System.out.println(p);
	}

}
