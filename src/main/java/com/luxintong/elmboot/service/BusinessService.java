package com.luxintong.elmboot.service;

import com.luxintong.elmboot.po.Business;

import java.util.List;

/**
 * @projectName: <h3>elmboot</h3>
 * @package: com.luxintong.elmboot.service
 * @className: BusinessService
 * @author: Lu Xintong
 * @description <p>BusinessService</p>
 * @date: 2023-12-25 22:07
 * @version: 1.0
 */
public interface BusinessService {
	/**
	 * @param orderTypeId
	 * @return
	 */
	public List<Business> listBusinessByOrderTypeId(Integer orderTypeId);
	
	/**
	 * @param businessId
	 * @return
	 */
	public Business getBusinessById(Integer businessId);
}
