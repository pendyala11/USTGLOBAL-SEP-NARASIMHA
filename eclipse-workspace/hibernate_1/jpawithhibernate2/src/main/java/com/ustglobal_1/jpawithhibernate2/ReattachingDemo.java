package com.ustglobal_1.jpawithhibernate2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.dto.Emp;

import javassist.bytecode.stackmap.BasicBlock.Catch;

public class ReattachingDemo {
EntityManager entityManager = null;
EntityTransaction entitytransaction = null;

try {
	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("TestPersistence");
	entityManager = entityManagerFactory.createEntityManager();
	entitytransaction = entityManager.getTransaction();
	entitytransaction.begin();
	Emp emp =entityManager.find(emp.class, 1);
	emp.setEmpid(1);
	emp.setName("narasimha");
	emp.setSalary(10000);
	
	
}
catch(Exception e )
{
e.printStackTrace();
entitytransaction.rollback();
}
}
