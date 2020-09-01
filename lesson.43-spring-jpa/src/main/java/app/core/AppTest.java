package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.dao.StudentDao;
import app.core.entities.Student;
import app.core.entities.Student.Gender;

public class AppTest {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {

			StudentDao studentDao = ctx.getBean(StudentDao.class);

			{// add students
				Student st1 = new Student("aaa", "aaaMail", Gender.M);
				Student st2 = new Student("bbb", "bbbMail", Gender.F);
				Student st3 = new Student("ccc", "cccMail", Gender.F);
				studentDao.addStudent(st1);
				studentDao.addStudent(st2);
				studentDao.addStudent(st3);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
