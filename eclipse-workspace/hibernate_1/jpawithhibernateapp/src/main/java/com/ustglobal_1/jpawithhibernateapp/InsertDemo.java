package com.ustglobal_1.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.dto.entity.Product;

public class InsertDemo {
	public static void main(String[] args) {
		Product product = new Product();
		product.setId(101);
		product.setPrice(35000);
		product.setName("fastrack");

		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(product);
		System.out.println("record saved");
		entityTransaction.commit();
		entityManager.close();
	}

}
