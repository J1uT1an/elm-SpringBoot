package com.luxintong.elmboot.service.impl;

import com.luxintong.elmboot.mapper.CartMapper;
import com.luxintong.elmboot.mapper.OrderDetailetMapper;
import com.luxintong.elmboot.mapper.OrdersMapper;
import com.luxintong.elmboot.po.Cart;
import com.luxintong.elmboot.po.OrderDetailet;
import com.luxintong.elmboot.po.Orders;
import com.luxintong.elmboot.service.OrdersService;
import com.luxintong.elmboot.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @projectName: <h3>elmboot</h3>
 * @package: com.luxintong.elmboot.service.impl
 * @className: OrdersServiceImpl
 * @author: Lu Xintong
 * @description <p>OrdersServiceImpl</p>
 * @date: 2023-12-26 15:02
 * @version: 1.0
 */
@Service
public class OrdersServiceImpl implements OrdersService {
	@Autowired
	private CartMapper cartMapper;
	@Autowired
	private OrdersMapper ordersMapper;
	@Autowired
	private OrderDetailetMapper orderDetailetMapper;
	
	@Override
	@Transactional
	public int createOrders(Orders orders) {
		// 1.查询当前用户购物车中当前商家的所有食品
		Cart cart = new Cart();
		cart.setUserId(orders.getUserId());
		cart.setBusinessId(orders.getBusinessId());
		List<Cart> cartList = cartMapper.listCart(cart);
		
		// 2.创建订单（返回生成的订单编号）
		// 生成订单要有当前日期
		orders.setOrderDate(CommonUtil.getCurrentDate());
		ordersMapper.saveOrders(orders);
		int orderId = orders.getOrderId();
		
		// 3.批量添加订单明细
		List<OrderDetailet> list = new ArrayList<>();
		for (Cart c : cartList) {
			OrderDetailet od = new OrderDetailet();
			od.setOrderId(orderId);
			od.setFoodId(c.getFoodId());
			od.setQuantity(c.getQuantity());
			list.add(od);
		}
		orderDetailetMapper.saveOrderDetailetBatch(list);
		
		// 4.从购物车表中删除相关食品信息
		cartMapper.removeCart(cart);
		
		// 返回生成的订单 id
		return orderId;
	}
}
