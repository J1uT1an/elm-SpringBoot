package com.luxintong.elmboot.service;

import com.luxintong.elmboot.po.User;

/**
 * @projectName: <h3>elmboot</h3>
 * @package: com.luxintong.elmboot.service.impl
 * @className: UserService
 * @author: Lu Xintong
 * @description <p>UserService</p>
 * @date: 2023-12-26 12:45
 * @version: 1.0
 */
public interface UserService {
	/**
	 * @param user
	 * @return
	 */
	public User getUserByIdByPass(User user);
}
