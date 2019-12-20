package com.ustglobal.stockmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.stockmanagement.dao.ProductDao;
import com.ustglobal.stockmanagement.dto.ProductsInfo;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private  ProductDao dao;

	@Override
	public boolean addProduct(ProductsInfo product) {
		return dao.addProduct(product);
	}

	@Override
	public boolean updateProduct(ProductsInfo product) {
		return dao.updateProduct(product);
	}

	@Override
	public boolean deleteProductById(int id) {
		return dao.deleteProductById(id);
	}

	@Override
	public boolean deleteProductByName(String name) {
		return dao.deleteProductByName(name);
	}

	@Override
	public boolean deleteProductByCategory(String catagory) {
		return dao.deleteProductByCategory(catagory);
	}

	@Override
	public ProductsInfo getProductById(int id) {
		return dao.getProductById(id);
	}

	@Override
	public List<ProductsInfo> getProductByName(String name) {
		return dao.getProductByName(name);
	}

	@Override
	public List<ProductsInfo> getProductByCategory(String category) {
		return dao.getProductByCategory(category);
	}

	@Override
	public List<ProductsInfo> getAllProduct() {
		return dao.getAllProduct();
	}

	@Override
	public List<ProductsInfo> cart(int id, int quantity, double price) {
		return dao.cart(id, quantity, price);
	}

	@Override
	public List<ProductsInfo> getProductByCompany(String company) {
		return dao.getProductByCompany(company);
	}

}
