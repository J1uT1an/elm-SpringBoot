package com.luxintong.elmboot.controller;

import com.luxintong.elmboot.po.Business;
import com.luxintong.elmboot.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @projectName: <h3>elmboot</h3>
 * @package: com.luxintong.elmboot.controller
 * @className: BusinessController
 * @author: Lu Xintong
 * @description <p>BusinessController</p>
 * @date: 2023-12-25 22:10
 * @version: 1.0
 */
@RestController
@RequestMapping("/BusinessController")
public class BusinessController {
	@Autowired
	private BusinessService businessService;
	
	@RequestMapping("/listBusinessByOrderTypeId")
	public List<Business> listBusinessByOrderTypeId(Business business) throws Exception {
		return businessService.listBusinessByOrderTypeId(business.getOrderTypeId());
	}
	
	@RequestMapping("/getBusinessById")
	public Business getBusinessById(Business business) throws Exception {
		return businessService.getBusinessById(business.getBusinessId());
	}
}
