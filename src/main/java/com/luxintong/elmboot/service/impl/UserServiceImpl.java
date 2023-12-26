package com.luxintong.elmboot.service.impl;

import com.luxintong.elmboot.mapper.UserMapper;
import com.luxintong.elmboot.po.User;
import com.luxintong.elmboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @projectName: <h3>elmboot</h3>
 * @package: com.luxintong.elmboot.service.impl
 * @className: UserServiceImpl
 * @author: Lu Xintong
 * @description <p>UserServiceImpl</p>
 * @date: 2023-12-26 12:45
 * @version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getUserByIdByPass(User user) {
		return userMapper.getUserByIdByPass(user);
	}
	
	@Override
	public int getUserById(String userId) {
		return userMapper.getUserById(userId);
	}
	
	@Override
	public int saveUser(User user) {
		return userMapper.saveUser(user);
	}
}
