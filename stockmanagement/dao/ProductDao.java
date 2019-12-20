package com.ustglobal.stockmanagement.dao;

import java.util.List;

import com.ustglobal.stockmanagement.dto.ProductsInfo;

public interface ProductDao {
	public boolean addProduct(ProductsInfo product);
	public boolean updateProduct(ProductsInfo product);
	public boolean deleteProductById(int id);
	public boolean deleteProductByName(String name);
	public boolean deleteProductByCategory(String category);
	public ProductsInfo          getProductById(int id);
	public List<ProductsInfo>    getProductByName(String name);
	public List<ProductsInfo>    getProductByCategory(String category);
	public List<ProductsInfo>    getProductByCompany(String company);
	public List<ProductsInfo>    getAllProduct();
	public List<ProductsInfo> cart(int id,int quantity,double price);
}
