package com.luxintong.elmboot.mapper;

import com.luxintong.elmboot.po.Cart;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

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
	public List<Cart> listCart(Cart cart); // 注解在 src/main/resources/mapper/CartMapper.xml 里
	
	/**
	 * @param cart
	 * @return
	 */
	@Insert("insert into cart values(null, #{foodId}, #{businessId}, #{userId}, 1)")
	public int saveCart(Cart cart);
	
	/**
	 * @param cart
	 * @return
	 */
	@Update("update cart set quantity = #{quantity} where foodId = #{foodId} and businessId = #{businessId} and userId = #{userId}")
	public int updateCart(Cart cart);
	
	/**
	 * @param cart
	 * @return
	 */
	public int removeCart(Cart cart); // 注解在 src/main/resources/mapper/CartMapper.xml 里
}
