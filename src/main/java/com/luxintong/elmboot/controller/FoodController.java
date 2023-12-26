package com.luxintong.elmboot.controller;

import com.luxintong.elmboot.po.Food;
import com.luxintong.elmboot.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @projectName: <h3>elmboot</h3>
 * @package: com.luxintong.elmboot.controller
 * @className: FoodController
 * @author: Lu Xintong
 * @description <p>FoodController</p>
 * @date: 2023-12-26 11:11
 * @version: 1.0
 */
@RestController
@RequestMapping("/FoodController")
public class FoodController {
	@Autowired
	private FoodService foodService;
	
	@RequestMapping("/listFoodByBusinessId")
	public List<Food> listFoodByBusinessId(Food food) throws Exception {
		return foodService.listFoodByBusinessId(food.getBusinessId());
	}
}
