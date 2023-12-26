package com.luxintong.elmboot.po;

/**
 * @projectName: <h3>elm-SpringBoot</h3>
 * @package: com.luxintong.elmboot.po
 * @className: Business
 * @author: Lu Xintong
 * @description <p>Business</p>
 * @date: 2023-12-25 21:45
 * @version: 1.0
 */
public class Business {
	private Integer businessId;
	private String businessName;
	private String businessAddress;
	private String businessExplain;
	private String businessImg;
	private Integer orderTypeId;
	/**
	 * 起送费
	 */
	private Double starPrice;
	/**
	 * 配送费
	 */
	private Double deliveryPrice;
	private String remarks;
	
	public Integer getBusinessId() {
		return businessId;
	}
	
	public void setBusinessId(Integer businessId) {
		this.businessId = businessId;
	}
	
	public String getBusinessName() {
		return businessName;
	}
	
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	
	public String getBusinessAddress() {
		return businessAddress;
	}
	
	public void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;
	}
	
	public String getBusinessExplain() {
		return businessExplain;
	}
	
	public void setBusinessExplain(String businessExplain) {
		this.businessExplain = businessExplain;
	}
	
	public String getBusinessImg() {
		return businessImg;
	}
	
	public void setBusinessImg(String businessImg) {
		this.businessImg = businessImg;
	}
	
	public Integer getOrderTypeId() {
		return orderTypeId;
	}
	
	public void setOrderTypeId(Integer orderTypeId) {
		this.orderTypeId = orderTypeId;
	}
	
	public Double getStarPrice() {
		return starPrice;
	}
	
	public void setStarPrice(Double starPrice) {
		this.starPrice = starPrice;
	}
	
	public Double getDeliveryPrice() {
		return deliveryPrice;
	}
	
	public void setDeliveryPrice(Double deliveryPrice) {
		this.deliveryPrice = deliveryPrice;
	}
	
	public String getRemarks() {
		return remarks;
	}
	
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
}
