package com.ustglobal.webapp1.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {
@Id
@Column
@GeneratedValue
private int id;
@Column
private String productname;
@Column
private float priceperunit;
@Column
private int quantity;
@Column
private float amountpayable;
@Column
private int retailerId;

public int getRetailerId() {
	return retailerId;
}
public void setRetailerId(int retailerId) {
	this.retailerId = retailerId;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public float getPriceperunit() {
	return priceperunit;
}
public void setPriceperunit(float priceperunit) {
	this.priceperunit = priceperunit;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public float getAmountpayable() {
	return amountpayable;
}
public void setAmountpayable(int amountpayable) {
	this.amountpayable = amountpayable;
}

}
