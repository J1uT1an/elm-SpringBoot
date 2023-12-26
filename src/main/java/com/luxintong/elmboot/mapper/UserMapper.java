package com.luxintong.elmboot.mapper;

import com.luxintong.elmboot.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @projectName: <h3>elmboot</h3>
 * @package: com.luxintong.elmboot.mapper
 * @className: UserMappert
 * @author: Lu Xintong
 * @description <p>UserMappert</p>
 * @date: 2023-12-26 11:29
 * @version: 1.0
 */
@Mapper
public interface UserMapper {
	/**
	 * @param user
	 * @return
	 */
	@Select("select * from user where userId = #{userId} and password=#{password};")
	public User getUserByIdByPass(User user);
}
