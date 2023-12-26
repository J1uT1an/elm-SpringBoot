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
	
}
