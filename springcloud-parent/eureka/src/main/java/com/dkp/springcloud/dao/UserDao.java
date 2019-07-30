package com.dkp.springcloud.dao;

import org.springframework.stereotype.Component;
import com.dkp.springcloud.domain.User;
@Component
public interface UserDao {
    public User findUser();
    	
}
