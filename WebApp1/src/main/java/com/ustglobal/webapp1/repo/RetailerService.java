package com.ustglobal.webapp1.repo;

import com.ustglobal.webapp1.beans.Orders;
import com.ustglobal.webapp1.beans.Retailer;

public interface RetailerService {
	public int createProfile(Retailer bean);
	public Retailer login(int id,String password);
	public Retailer searchProducts(int id);
	public boolean changePassword(int id,String password);
	public float totalAmount(float amountpayable);
	public Orders retrieveOrders(int retailerId);

}
