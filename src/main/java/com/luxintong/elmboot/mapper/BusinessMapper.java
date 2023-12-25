package com.luxintong.elmboot.mapper;

import com.luxintong.elmboot.po.Business;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @projectName: <h3>elmboot</h3>
 * @package: com.luxintong.elmboot.mapper
 * @className: BusinessMapper
 * @author: Lu Xintong
 * @description <p>BusinessMapper</p>
 * @date: 2023-12-25 21:53
 * @version: 1.0
 */
@Mapper
public interface BusinessMapper {
	/**
	 * @param orderTypeId
	 * @return
	 */
	@Select("select * from business where orderTypeId = #{orderTypeId} order by businessId")
	public List<Business> listBusinessByOrderTypeId(Integer orderTypeId);
	
	/**
	 * @param businessId
	 * @return
	 */
	@Select("select * from business where businessId = #{businessId}")
	public Business getBusinessById(Integer businessId);
}
