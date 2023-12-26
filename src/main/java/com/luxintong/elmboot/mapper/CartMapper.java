package com.luxintong.elmboot.mapper;

import com.luxintong.elmboot.po.Cart;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @projectName: <h3>elmboot</h3>
 * @package: com.luxintong.elmboot.mapper
 * @className: CartMapper
 * @author: Lu Xintong
 * @description <p>CartMapper</p>
 * @date: 2023-12-26 13:24
 * @version: 1.0
 */
@Mapper
public interface CartMapper {
	/**
	 * @param cart
	 * @return
	 */
	public List<Cart> listCart(Cart cart);
}
