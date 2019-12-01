package com.ustglobal_1.jpawithhibernate2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.dto.Emp;

public class Select {
 public static void main(String[] args) {
	EntityTransaction transaction = null;
	EntityManager entityManager=null;
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
	entityManager = entityManagerFactory.createEntityManager();
	Emp emp = entityManager.getReference(Emp.class, 1);
	System.out.println(emp.getEmpid());
	System.out.println(emp.getName());
	System.out.println(emp.getSalary());
	entityManager.close();
}
}
