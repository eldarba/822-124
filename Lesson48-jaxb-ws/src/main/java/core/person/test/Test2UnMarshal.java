package core.person.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import core.person.Person;

public class Test2UnMarshal {

	public static void main(String[] args) {

//		Person p = new Person(101, "Yosi Lev", 35);

		try {
			JAXBContext ctx = JAXBContext.newInstance("core.person");
			Unmarshaller unMarshaller = ctx.createUnmarshaller();
			Person p = (Person) unMarshaller.unmarshal(new File("files/person.xml"));
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println(p.getAge());
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// הפסקה עד 19:27

	}

}
