package com.ustglobal.stockmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.stockmanagement.dto.ProductsInfo;
import com.ustglobal.stockmanagement.service.ProductService;


@CrossOrigin(origins = "*",allowedHeaders = "*",allowCredentials = "true")
@RestController
public class StockController {
	@Autowired
	private ProductService service;

	@PostMapping(path = "/addP",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public  boolean addProduct(@RequestBody ProductsInfo product) {
		if(service.addProduct(product)){
			return true;
		}
		else{
			return false;
		}
	}

	@PostMapping(path = "/updateP",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean updateProduct(@RequestBody ProductsInfo product) {
		if (service.updateProduct(product)) {
			return true;
		}
		else {
			return false;
		}
	}

	@GetMapping(path="getPName",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProductsInfo> getProductByName(@PathVariable("name")String name) {
		return service.getProductByName(name);
	}

	@GetMapping(path="getPCategory",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public  List<ProductsInfo> getProductByCategory(@RequestParam("category")String category ){
		return service.getProductByCategory(category);
	}

	@GetMapping(path="getPC",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public  List<ProductsInfo> getProductByCompany(@RequestParam("company")String company ){
		return service.getProductByCompany(company);
	}
}