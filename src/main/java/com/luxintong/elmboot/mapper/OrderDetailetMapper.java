package com.luxintong.elmboot.mapper;

import com.luxintong.elmboot.po.OrderDetailet;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @projectName: <h3>elmboot</h3>
 * @package: com.luxintong.elmboot.mapper
 * @className: OrderDetailetMapper
 * @author: Lu Xintong
 * @description <p>OrderDetailetMapper</p>
 * @date: 2023-12-26 15:19
 * @version: 1.0
 */
@Mapper
public interface OrderDetailetMapper {
	/**
	 * @param list
	 * @return
	 */
	public int saveOrderDetailetBatch(List<OrderDetailet> list); // 注解在 src/main/resources/mapper/OrderDetailetMapper.xml 里
	
	/**
	 * @param order
	 * @return
	 */
	public List<OrderDetailet> listOrderDetailetByOrderId(Integer order); // 注解在 src/main/resources/mapper/OrderDetailetMapper.xml 里
}
