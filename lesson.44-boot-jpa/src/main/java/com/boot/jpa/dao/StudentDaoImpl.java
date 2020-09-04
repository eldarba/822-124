package com.boot.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.boot.jpa.entities.Student;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public int addStudent(Student student) {
		// you can unwrap the underlying JPA implementor (Hibernate)
		// em.unwrap(Session.class).save(student);
		em.persist(student);
		return student.getId();
	}

	@Override
	public Student getStudent(int studentId) {
		return em.find(Student.class, studentId);
	}

	@Override
	public List<Student> getAllStudents() {
		TypedQuery<Student> query = em.createQuery("from Student", Student.class);
		return query.getResultList();
	}

	@Override
	public boolean updateStudent(Student student) {
		Student st = getStudent(student.getId());
		if (st != null) {
			st.setName(student.getName());
			st.setEmail(student.getEmail());
			st.setGender(student.getGender());
			return true;
		}

		return false;
	}

	@Override
	public boolean deleteStudent(int studentId) {
		Student st = getStudent(studentId);
		if (st != null) {
			em.remove(st);
			return true;
		}
		return false;
	}

}
