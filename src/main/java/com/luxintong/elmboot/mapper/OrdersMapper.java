package com.luxintong.elmboot.mapper;

import com.luxintong.elmboot.po.Orders;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

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
	 * @description 插入orderDate 在 src/main/java/com/luxintong/elmboot/service/impl/OrdersServiceImpl.java 里插入
	 */
	@Insert("insert into orders(userId, businessId, orderDate, orderTotal, daId, orderState) values (#{userId},#{businessId},#{orderDate},#{orderTotal},#{daId},0)")
	@Options(useGeneratedKeys = true, keyProperty = "orderId", keyColumn = "orderId")
	public int saveOrders(Orders orders);
}
