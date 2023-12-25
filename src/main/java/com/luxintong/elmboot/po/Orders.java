package com.luxintong.elmboot.po;

import java.util.List;

/**
 * @projectName: <h3>elm-SpringBoot</h3>
 * @package: com.luxintong.elmboot.po
 * @className: Orders
 * @author: Lu Xintong
 * @description <p>Orders</p>
 * @date: 2023-12-25 21:45
 * @version: 1.0
 */
public class Orders {
	private Integer orderId;
	private String userId;
	private Integer businessId;
	private String orderDate;
	private Double orderTotal;
	private Integer daId;
	private Integer orderState;
	private Business business;
	private List<OrderDetailet> list;
	
	public List<OrderDetailet> getList() {
		return list;
	}
	
	public void setList(List<OrderDetailet> list) {
		this.list = list;
	}
	
	
	public Business getBusiness() {
		return business;
	}
	
	public void setBusiness(Business business) {
		this.business = business;
	}
	
	public Integer getOrderId() {
		return orderId;
	}
	
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public Integer getBusinessId() {
		return businessId;
	}
	
	public void setBusinessId(Integer businessId) {
		this.businessId = businessId;
	}
	
	public String getOrderDate() {
		return orderDate;
	}
	
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	public Double getOrderTotal() {
		return orderTotal;
	}
	
	public void setOrderTotal(Double orderTotal) {
		this.orderTotal = orderTotal;
	}
	
	public Integer getDaId() {
		return daId;
	}
	
	public void setDaId(Integer daId) {
		this.daId = daId;
	}
	
	public Integer getOrderState() {
		return orderState;
	}
	
	public void setOrderState(Integer orderState) {
		this.orderState = orderState;
	}
	
	
}
