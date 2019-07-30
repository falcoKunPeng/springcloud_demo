package com.dkp.springcloud.dao.impl;

import com.dkp.springcloud.dao.UserDao;
import com.dkp.springcloud.domain.User;

public class UserDaoImpl implements UserDao{

	@Override
	public User findUser() {
        User user=new User();
        user.setUserName("test");
        user.setPassword("test");
		return user ;
	}

}
