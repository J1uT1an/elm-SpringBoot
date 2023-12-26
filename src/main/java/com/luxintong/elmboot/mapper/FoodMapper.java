package com.luxintong.elmboot.mapper;

import com.luxintong.elmboot.po.Food;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @projectName: <h3>elmboot</h3>
 * @package: com.luxintong.elmboot.mapper
 * @className: FoodMapper
 * @author: Lu Xintong
 * @description <p>FoodMapper</p>
 * @date: 2023-12-26 11:07
 * @version: 1.0
 */
@Mapper
public interface FoodMapper {
	/**
	 * @param businessId
	 * @return
	 */
	@Select("select * from food where businessId = #{businessId} order by foodId")
	public List<Food> listFoodByBusinessId(Integer businessId);
	
	/**
	 * @param foodId
	 * @return
	 */
	@Select("select * from food where foodId = #{foodId}")
	public Food getFoodById(Integer foodId);
}
