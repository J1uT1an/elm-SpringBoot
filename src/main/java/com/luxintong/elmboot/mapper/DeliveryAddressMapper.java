package com.luxintong.elmboot.mapper;

import com.luxintong.elmboot.po.DeliveryAddress;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @projectName: <h3>elmboot</h3>
 * @package: com.luxintong.elmboot.mapper
 * @className: DeliveryAddressMapper
 * @author: Lu Xintong
 * @description <p>DeliveryAddressMapper</p>
 * @date: 2023-12-26 14:34
 * @version: 1.0
 */
@Mapper
public interface DeliveryAddressMapper {
	/**
	 * @param userId
	 * @return
	 */
	@Select("select * from deliveryaddress where userId = #{userId} order by daId")
	public List<DeliveryAddress> listDeliveryAddressByUserId(String userId);
}
