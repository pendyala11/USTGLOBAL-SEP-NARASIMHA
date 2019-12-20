package com.ustglobal.stockmanagement.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orderinfo")
public class OrderInfo {
    @Id
    @GeneratedValue
    @Column
	private int id;
    @Column
	private double totalprice;
    @Column
	private double totalpricewithgst;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	public double getTotalpricewithgst() {
		return totalpricewithgst;
	}
	public void setTotalpricewithgst(double totalpricewithgst) {
		this.totalpricewithgst = totalpricewithgst;
	}
    
}
