package com.ajeet.annotationMisc;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ajeet.utility.EMUtil;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Override
	public String insertStudent(Student s) {
		String result="Not inserted...";
		
		EntityManager em= EMUtil.provideEM();
		em.getTransaction().begin();
		em.persist(s);
		result="Inserted successfully...";
		em.getTransaction().commit();
		em.close();
		return result;
	}

	@Override
	public List<Student> getAll() {
//		List<Student> ls= new ArrayList<>();
		EntityManager em= EMUtil.provideEM();
		Query q=em.createQuery("from student");
		
		em.close();
		return q.getResultList();
	}

}
