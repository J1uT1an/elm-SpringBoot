package com.luxintong.elmboot.mapper;

import com.luxintong.elmboot.po.Orders;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import java.util.List;

/**
 * @projectName: <h3>elmboot</h3>
 * @package: com.luxintong.elmboot.mapper
 * @className: OrdersMapper
 * @author: Lu Xintong
 * @description <p>OrdersMapper</p>
 * @date: 2023-12-26 15:01
 * @version: 1.0
 */
@Mapper
public interface OrdersMapper {
	/**
	 * @param orders
	 * @return
	 * @description 插入 orderDate 在 src/main/java/com/luxintong/elmboot/service/impl/OrdersServiceImpl.java 里插入
	 */
	@Insert("insert into orders(userId, businessId, orderDate, orderTotal, daId, orderState) values (#{userId},#{businessId},#{orderDate},#{orderTotal},#{daId},0)")
	@Options(useGeneratedKeys = true, keyProperty = "orderId", keyColumn = "orderId")
	public int saveOrders(Orders orders);
	
	/**
	 * @param orderId
	 * @return
	 */
	public Orders getOrdersById(Integer orderId); // 注解在 src/main/resources/mapper/OrdersMapper.xml 里
	
	/**
	 * @param userId
	 * @return
	 */
	public List<Orders> listOrdersByUserId(String userId); // 注解在 src/main/resources/mapper/OrdersMapper.xml 里
}
