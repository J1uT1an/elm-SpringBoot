package com.luxintong.elmboot.po;

/**
 * @projectName: <h3>elm-SpringBoot</h3>
 * @package: com.luxintong.elmboot.po
 * @className: DeliveryAddress
 * @author: Lu Xintong
 * @description <p>DeliveryAddress</p>
 * @date: 2023-12-25 21:45
 * @version: 1.0
 */
public class DeliveryAddress {
	private Integer daId;
	private String contactName;
	private Integer contactSex;
	private String contactTel;
	private String address;
	private String userId;
	
	public Integer getDaId() {
		return daId;
	}
	
	public void setDaId(Integer daId) {
		this.daId = daId;
	}
	
	public String getContactName() {
		return contactName;
	}
	
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	
	public Integer getContactSex() {
		return contactSex;
	}
	
	public void setContactSex(Integer contactSex) {
		this.contactSex = contactSex;
	}
	
	public String getContactTel() {
		return contactTel;
	}
	
	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}
