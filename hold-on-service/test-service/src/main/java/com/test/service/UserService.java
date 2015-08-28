package com.test.service;

import com.test.domain.User;

import java.util.List;

/**
 * Created by songzheqi on 15/8/21.
 */
public interface UserService {
     boolean insertUse(User user);
     boolean login(User user);
     List<User> queryAll();
     List<User> queryName(String name);
}
