package com.gzucm.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.gzucm.dao.UserDao;
import com.gzucm.domain.User;
import com.gzucm.service.UserService;
@Transactional
public class UserServiceImpl implements UserService{
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	public User login(User user) {
		
		return userDao.login(user);
	}

}
