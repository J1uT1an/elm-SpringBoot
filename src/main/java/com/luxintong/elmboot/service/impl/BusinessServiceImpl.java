package com.luxintong.elmboot.service.impl;

import com.luxintong.elmboot.mapper.BusinessMapper;
import com.luxintong.elmboot.po.Business;
import com.luxintong.elmboot.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @projectName: <h3>elmboot</h3>
 * @package: com.luxintong.elmboot.service.impl
 * @className: BusinessServiceImpl
 * @author: Lu Xintong
 * @description <p>BusinessServiceImpl</p>
 * @date: 2023-12-25 22:07
 * @version: 1.0
 */
@Service
public class BusinessServiceImpl implements BusinessService {
	@Autowired
	private BusinessMapper businessMapper;
	
	@Override
	public List<Business> listBusinessByOrderTypeId(Integer orderTypeId) {
		return businessMapper.listBusinessByOrderTypeId(orderTypeId);
	}
	
	@Override
	public Business getBusinessById(Integer businessId) {
		return businessMapper.getBusinessById(businessId);
	}
}
