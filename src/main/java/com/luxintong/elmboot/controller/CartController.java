package com.luxintong.elmboot.controller;

import com.luxintong.elmboot.po.Cart;
import com.luxintong.elmboot.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @projectName: <h3>elmboot</h3>
 * @package: com.luxintong.elmboot.controller
 * @className: CartController
 * @author: Lu Xintong
 * @description <p>CartController</p>
 * @date: 2023-12-26 13:55
 * @version: 1.0
 */
@RestController
@RequestMapping("/CartController")
public class CartController {
	@Autowired
	private CartService cartService;
	
	@RequestMapping("/listCart")
	public List<Cart> listCart(Cart cart) throws Exception {
		return cartService.listCart(cart);
	}
	
	@RequestMapping("/saveCart")
	public int saveCart(Cart cart) throws Exception {
		return cartService.saveCart(cart);
	}
	
	@RequestMapping("/updateCart")
	public int updateCart(Cart cart) throws Exception {
		return cartService.updateCart(cart);
	}
	
	@RequestMapping("/removeCart")
	public int removeCart(Cart cart) throws Exception {
		return cartService.removeCart(cart);
	}
}
