package com.boot.jpa;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.boot.jpa.dao.StudentDao;
import com.boot.jpa.entities.Student;
import com.boot.jpa.entities.Student.Gender;

@SpringBootApplication
public class Application implements ApplicationContextAware {

	private static ApplicationContext ctx;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		StudentDao dao = ctx.getBean(StudentDao.class);
		dao.addStudent(new Student("aaa", "aaaMail", Gender.M));
		dao.addStudent(new Student("bbb", "bbbMail", Gender.F));
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ctx = applicationContext;
	}

}
