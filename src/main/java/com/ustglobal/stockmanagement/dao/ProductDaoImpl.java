package com.ustglobal.stockmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.stockmanagement.dto.ProductsInfo;

@Repository
public class ProductDaoImpl implements ProductDao {
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addProduct(ProductsInfo product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(product);
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean updateProduct(ProductsInfo product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			ProductsInfo p = manager.find(ProductsInfo.class, product.getId());
			p.setCategory(product.getCategory());
			p.setName(product.getName());
			p.setQuantity(product.getQuantity());
			p.setPrice(product.getPrice());
			p.setCompany(product.getCompany());
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean deleteProductById(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			ProductsInfo product = manager.find(ProductsInfo.class, id);
			manager.remove(product);
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean deleteProductByName(String name) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			String jpql = "from ProductsInfo where name=:name";
			TypedQuery<ProductsInfo> typedQuery = manager.createQuery(jpql, ProductsInfo.class);
			typedQuery.setParameter("name", name);
			ProductsInfo product = typedQuery.getSingleResult();
			manager.remove(product);
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean deleteProductByCategory(String category) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			String jpql = "from ProductsInfo where category=:category";
			TypedQuery<ProductsInfo> typedQuery = manager.createQuery(jpql, ProductsInfo.class);
			typedQuery.setParameter("category", category);
			List<ProductsInfo> products = typedQuery.getResultList();
			for (ProductsInfo product : products) {
				manager.remove(product);
			}
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	@Override
	public ProductsInfo getProductById(int id) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(ProductsInfo.class, id);
	}

	@Override
	public List<ProductsInfo> getProductByName(String name) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from ProductsInfo where name=:name";
		TypedQuery<ProductsInfo> typedQuery = manager.createQuery(jpql, ProductsInfo.class);
		typedQuery.setParameter("name", name);
		return typedQuery.getResultList();
	}

	

	@Override
	public List<ProductsInfo> getAllProduct() {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from ProductsInfo";
		TypedQuery<ProductsInfo> typedQuery = manager.createQuery(jpql, ProductsInfo.class);
		return typedQuery.getResultList();
	}

	@Override
	public List<ProductsInfo> cart(int id, int quantity, double price) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction11 = manager.getTransaction();
		try {
			transaction11.begin();
			String jpql = "from ProductsInfo where id=:id ,quantity=:quantity ,price=:price ";
			TypedQuery<ProductsInfo> typedQuery = manager.createQuery(jpql, ProductsInfo.class);
			
			typedQuery.setParameter("id", id);
			typedQuery.setParameter("quantity", quantity);
			typedQuery.setParameter("price", price);
			
			List<ProductsInfo> products = typedQuery.getResultList();
			transaction11.commit();
			return products;
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<ProductsInfo> getProductByCategory(String category) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from ProductsInfo where category=:category";
		TypedQuery<ProductsInfo> typedQuery = manager.createQuery(jpql, ProductsInfo.class);
		typedQuery.setParameter("category", category);
		return typedQuery.getResultList();
	}

	@Override
	public List<ProductsInfo> getProductByCompany(String company) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from ProductsInfo where company=:company";
		TypedQuery<ProductsInfo> typedQuery = manager.createQuery(jpql, ProductsInfo.class);
		typedQuery.setParameter("company", company);
		return typedQuery.getResultList();
	}

}
