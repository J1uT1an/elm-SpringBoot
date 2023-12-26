package com.luxintong.elmboot.service.impl;

import com.luxintong.elmboot.mapper.FoodMapper;
import com.luxintong.elmboot.po.Food;
import com.luxintong.elmboot.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @projectName: <h3>elmboot</h3>
 * @package: com.luxintong.elmboot.service.impl
 * @className: FoodServiceImpl
 * @author: Lu Xintong
 * @description <p>FoodServiceImpl</p>
 * @date: 2023-12-26 11:09
 * @version: 1.0
 */
@Service
public class FoodServiceImpl implements FoodService {
	@Autowired
	private FoodMapper foodMapper;
	
	@Override
	public List<Food> listFoodByBusinessId(Integer businessId) {
		return foodMapper.listFoodByBusinessId(businessId);
	}
}
