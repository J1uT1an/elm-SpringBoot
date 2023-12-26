package com.luxintong.elmboot.service;

import com.luxintong.elmboot.po.DeliveryAddress;

import java.util.List;

/**
 * @projectName: <h3>elmboot</h3>
 * @package: com.luxintong.elmboot.service
 * @className: DeliveryAddressService
 * @author: Lu Xintong
 * @description <p>DeliveryAddressService</p>
 * @date: 2023-12-26 14:36
 * @version: 1.0
 */
public interface DeliveryAddressService {
	/**
	 * @param userId
	 * @return
	 */
	public List<DeliveryAddress> listDeliveryAddressByUserId(String userId);
}
