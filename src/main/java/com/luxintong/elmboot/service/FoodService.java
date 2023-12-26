package com.luxintong.elmboot.service;

import com.luxintong.elmboot.po.Food;

import java.util.List;

/**
 * @projectName: <h3>elmboot</h3>
 * @package: com.luxintong.elmboot.service
 * @className: FoodService
 * @author: Lu Xintong
 * @description <p>FoodService</p>
 * @date: 2023-12-26 11:09
 * @version: 1.0
 */
public interface FoodService {
	/**
	 * @param businessId
	 * @return
	 */
	public List<Food> listFoodByBusinessId(Integer businessId);
}
