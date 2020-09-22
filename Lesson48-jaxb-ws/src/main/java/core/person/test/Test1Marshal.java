package core.person.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import core.person.Person;

public class Test1Marshal {

	public static void main(String[] args) {

		Person p = new Person(101, "Yosi Lev", 35);

		try {
			JAXBContext ctx = JAXBContext.newInstance("core.person");
			Marshaller marshaller = ctx.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(p, new File("files/person.xml"));
			System.out.println("done");
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
