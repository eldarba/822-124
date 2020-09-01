package app.core;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.dao.StudentDao;
import app.core.entities.Student;

public class AppTest {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {

			StudentDao studentDao = ctx.getBean(StudentDao.class);

//			{// add students
//				Student st1 = new Student("aaa", "aaaMail", Gender.M);
//				Student st2 = new Student("bbb", "bbbMail", Gender.F);
//				Student st3 = new Student("ccc", "cccMail", Gender.F);
//				int id = studentDao.addStudent(st1);
//				studentDao.addStudent(st2);
//				studentDao.addStudent(st3);
//
//				System.out.println("id: " + id);
//			}

//			{ // get student
//				int id1 = 3;
//				int id2 = 35;
//				Student st1 = studentDao.getStudent(id1);
//				Student st2 = studentDao.getStudent(id2);
//				System.out.println(st1);
//				System.out.println(st2);
//			}

			{ // get all students
				System.out.println("----------------");
				List<Student> students = studentDao.getAllStudents();
				for (Student student : students) {
					System.out.println(student);
				}
				System.out.println("----------------");
			}

//			{ // update student
//				int id1 = 9;
//				int id2 = 35;
//				Student st1 = studentDao.getStudent(id1);
//				Student st2 = new Student("aaaa", "abs@Mail", Gender.M);
//				st2.setId(id2);
//
//				boolean updated;
//				updated = studentDao.updateStudent(st1);
//				System.out.println(st1 + " updated: " + updated);
//				updated = studentDao.updateStudent(st2);
//				System.out.println(st2 + " updated: " + updated);
//			}

//			{
//				studentDao.deleteStudent(5);
//			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
