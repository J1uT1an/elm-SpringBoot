package com.luxintong.elmboot.service;

import com.luxintong.elmboot.po.Cart;

import java.util.List;

/**
 * @projectName: <h3>elmboot</h3>
 * @package: com.luxintong.elmboot.service
 * @className: CartService
 * @author: Lu Xintong
 * @description <p>CartService</p>
 * @date: 2023-12-26 13:54
 * @version: 1.0
 */
public interface CartService {
	/**
	 * @param cart
	 * @return
	 */
	public List<Cart> listCart(Cart cart);
	
	/**
	 * @param cart
	 * @return
	 */
	public int saveCart(Cart cart);
}
