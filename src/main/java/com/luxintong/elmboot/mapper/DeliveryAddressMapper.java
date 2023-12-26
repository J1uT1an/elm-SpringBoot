package com.luxintong.elmboot.mapper;

import com.luxintong.elmboot.po.DeliveryAddress;
import org.apache.ibatis.annotations.*;

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
	
	/**
	 * @param daId
	 * @return
	 */
	@Select("select * from deliveryaddress where daId = #{daId}")
	public DeliveryAddress getDeliveryAddressById(Integer daId);
	
	/**
	 * @param deliveryAddress
	 * @return
	 */
	@Insert("insert into deliveryaddress values (null, #{contactName}, #{contactSex}, #{contactTel}, #{address}, #{userId})")
	public int saveDeliveryAddress(DeliveryAddress deliveryAddress);
	
	/**
	 * @param deliveryAddress
	 * @return
	 */
	@Update("update deliveryaddress set contactName = #{contactName}, contactSex = #{contactSex}, contactTel = #{contactTel}, address = #{address} where daId = #{daId}")
	public int updateDeliveryAddress(DeliveryAddress deliveryAddress);
	
	/**
	 * @param daId
	 * @return
	 */
	@Delete("delete from deliveryaddress where daId = #{daId}")
	public int removeDeliveryAddress(Integer daId);
}
