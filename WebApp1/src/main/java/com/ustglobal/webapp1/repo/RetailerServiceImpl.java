package com.ustglobal.webapp1.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.webapp1.beans.Orders;
import com.ustglobal.webapp1.beans.Retailer;
import com.ustglobal.webapp1.dao.Retailerdao;
@Service
public class RetailerServiceImpl implements RetailerService {
	@Autowired
	private Retailerdao dao;
	
	
	@Override
	public int createProfile(Retailer bean) {
		// TODO Auto-generated method stub
		return dao.createProfile(bean);
	}

	@Override
	public Retailer login(int id, String password) {
		// TODO Auto-generated method stub
		return dao.login(id, password);
	}

	@Override
	public Retailer searchProducts(int id) {
		// TODO Auto-generated method stub
		return dao.searchProducts(id);
	}

	@Override
	public boolean changePassword(int id, String password) {
		// TODO Auto-generated method stub
		return dao.changePassword(id, password);
	}

	@Override
	public float totalAmount(float amountpayable) {
		// TODO Auto-generated method stub
		return dao.totalAmount(amountpayable);
	}

	@Override
	public Orders retrieveOrders(int retailerId) {
		// TODO Auto-generated method stub
		return dao.retrieveOrders(retailerId);
	}

}
