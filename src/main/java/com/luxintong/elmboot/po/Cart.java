package com.luxintong.elmboot.po;

/**
 * @projectName: <h3>elm-SpringBoot</h3>
 * @package: com.luxintong.elmboot.po
 * @className: Cart
 * @author: Lu Xintong
 * @description <p>Cart</p>
 * @date: 2023-12-25 21:45
 * @version: 1.0
 */
public class Cart {
	private Integer cartId;
	private Integer foodId;
	private Integer businessId;
	private String userId;
	private Integer quantity;
	/**
	 * 多对一：所属食品
	 */
	private Food food;
	/**
	 * 多对一：所属商家
	 */
	private Business business;
	
	public Food getFood() {
		return food;
	}
	
	public void setFood(Food food) {
		this.food = food;
	}
	
	public Business getBusiness() {
		return business;
	}
	
	public void setBusiness(Business business) {
		this.business = business;
	}
	
	
	public Integer getCartId() {
		return cartId;
	}
	
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	
	public Integer getFoodId() {
		return foodId;
	}
	
	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}
	
	public Integer getBusinessId() {
		return businessId;
	}
	
	public void setBusinessId(Integer businessId) {
		this.businessId = businessId;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
}
