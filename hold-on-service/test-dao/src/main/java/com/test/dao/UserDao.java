package com.test.dao;

import com.test.domain.User;

import java.util.List;

/**
 * Created by songzheqi on 15/8/21.
 */
public interface UserDao {

     int insertUser(User user);
     int loginUser(User user);
     List<User> queryAll();
     List<User> queryName(String name);
}
