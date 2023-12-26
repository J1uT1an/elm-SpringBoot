package com.luxintong.elmboot.service.impl;

import com.luxintong.elmboot.mapper.CartMapper;
import com.luxintong.elmboot.po.Cart;
import com.luxintong.elmboot.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @projectName: <h3>elmboot</h3>
 * @package: com.luxintong.elmboot.service.impl
 * @className: CartServiceImpl
 * @author: Lu Xintong
 * @description <p>CartServiceImpl</p>
 * @date: 2023-12-26 13:54
 * @version: 1.0
 */
@Service
public class CartServiceImpl implements CartService {
	@Autowired
	private CartMapper cartMapper;
	
	@Override
	public List<Cart> listCart(Cart cart) {
		return cartMapper.listCart(cart);
	}
	
	@Override
	public int saveCart(Cart cart) {
		return cartMapper.saveCart(cart);
	}
	
	@Override
	public int updateCart(Cart cart) {
		return cartMapper.updateCart(cart);
	}
}
