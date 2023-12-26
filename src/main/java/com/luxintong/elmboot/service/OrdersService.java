package com.luxintong.elmboot.service;

import com.luxintong.elmboot.po.Orders;

/**
 * @projectName: <h3>elmboot</h3>
 * @package: com.luxintong.elmboot.service
 * @className: OrdersService
 * @author: Lu Xintong
 * @description <p>OrdersService</p>
 * @date: 2023-12-26 15:02
 * @version: 1.0
 */
public interface OrdersService {
	/**
	 * @param orders
	 * @return
	 */
	public int createOrders(Orders orders);
}
