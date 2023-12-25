package com.luxintong.elmboot.po;

/**
 * @projectName: <h3>elm-SpringBoot</h3>
 * @package: com.luxintong.elmboot.po
 * @className: OrderDetailet
 * @author: Lu Xintong
 * @description <p>OrderDetailet</p>
 * @date: 2023-12-25 21:45
 * @version: 1.0
 */
public class OrderDetailet {
	private Integer odId;
	private Integer orderId;
	private Integer foodId;
	private Integer quantity;
	private Food food;
	
	public Food getFood() {
		return food;
	}
	
	public void setFood(Food food) {
		this.food = food;
	}
	
	public Integer getOdId() {
		return odId;
	}
	
	public void setOdId(Integer odId) {
		this.odId = odId;
	}
	
	public Integer getOrderId() {
		return orderId;
	}
	
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	
	public Integer getFoodId() {
		return foodId;
	}
	
	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
}
