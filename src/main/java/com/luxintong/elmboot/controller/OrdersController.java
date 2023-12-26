package com.luxintong.elmboot.controller;

import com.luxintong.elmboot.po.Orders;
import com.luxintong.elmboot.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @projectName: <h3>elmboot</h3>
 * @package: com.luxintong.elmboot.mapper
 * @className: OrdersController
 * @author: Lu Xintong
 * @description <p>OrdersController</p>
 * @date: 2023-12-26 15:46
 * @version: 1.0
 */
@RestController
@RequestMapping("/OrdersController")
public class OrdersController {
	@Autowired
	private OrdersService orderService;
	
	@RequestMapping("/createOrders")
	public int createOrders(Orders orders) throws Exception {
		return orderService.createOrders(orders);
	}
	
	@RequestMapping("/getOrdersById")
	public Orders getOrdersById(Orders orders) throws Exception {
		return orderService.getOrdersById(orders.getOrderId());
	}
	
	@RequestMapping("/listOrdersByUserId")
	public List<Orders> listOrdersByUserId(Orders orders) throws Exception {
		return orderService.listOrdersByUserId(orders.getUserId());
	}
}
