package com.ustglobal.webapp1.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.webapp1.beans.Orders;
import com.ustglobal.webapp1.beans.Retailer;
@Repository
public class RetailerDaoImpl implements Retailerdao {

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public int createProfile(Retailer bean) {
		// TODO Auto-generated method stub
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return bean.getId();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return -1;
		}
		
	}

	@Override
	public Retailer login(int id, String password) {
		// TODO Auto-generated method stub
		
		String jpql ="from Retailer where id=:id and password=:pass";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Retailer> query = manager.createQuery(jpql, Retailer.class);
		query.setParameter("id", id);
		query.setParameter("pass", password);
		try {
			Retailer bean = query.getSingleResult();
			return bean;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public Retailer searchProducts(int id) {
		// TODO Auto-generated method stub
        EntityManager manager = factory.createEntityManager();
        return manager.find(Retailer.class, id);
		
	}

	@Override
	public boolean changePassword(int id, String password) {
		// TODO Auto-generated method stub
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Retailer bean =manager.find(Retailer.class, id);
		bean.setPassword(password);
		transaction.commit();
		return true;
	}

	@Override
	public float totalAmount(float amountpayable) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Orders retrieveOrders(int retailerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
