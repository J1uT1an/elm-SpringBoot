package com.luxintong.elmboot.controller;

import com.luxintong.elmboot.po.User;
import com.luxintong.elmboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @projectName: <h3>elmboot</h3>
 * @package: com.luxintong.elmboot.controller
 * @className: UserController
 * @author: Lu Xintong
 * @description <p>UserController</p>
 * @date: 2023-12-26 12:48
 * @version: 1.0
 */
@RestController
@RequestMapping("/UserController")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/getUserByIdByPass")
	public User getUserByIdByPass(User user) throws Exception {
		return userService.getUserByIdByPass(user);
	}
	
	@RequestMapping("/getUserById")
	public int getUserById(User user) throws Exception {
		return userService.getUserById(user.getUserId());
	}
	
	@RequestMapping("/saveUser")
	public int saveUser(User user) throws Exception {
		return userService.saveUser(user);
	}
}
