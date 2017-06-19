package com.gt.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gt.dao.IUserDao;
import com.gt.entity.User;
import com.gt.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
