package com.test.service.impl;

import com.test.dao.UserDao;
import com.test.domain.User;
import com.test.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by songzheqi on 15/8/21.
 */
@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao userDao;

    public boolean insertUse(User user) {

        int result = userDao.insertUser(user);
        System.out.println("result is      " + result);

        return true;
    }

    public boolean login(User user) {

        if (userDao.loginUser(user) == 1) {
            return true;
        }
        return false;
    }

    public List<User> queryAll(){

        return userDao.queryAll();
    }
    public List<User> queryName(String name){

        return userDao.queryName(name);
    }

}
