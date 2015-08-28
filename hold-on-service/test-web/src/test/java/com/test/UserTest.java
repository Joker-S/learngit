package com.test;

import com.test.domain.User;
import com.test.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by songzheqi on 15/8/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/conf/spring-servlet.xml",
        "classpath*:/conf/ApplicationContext.xml" })
public class UserTest {
//
//    @Resource
//    UserService userService;
//    @Test
//    public void testInsert() {
//
//        User u = new User();
//        u.setUsername("xiaohu");
//        u.setUserpassword("123");
//        userService.insertUse(u);
//        System.out.println("保存成功！");
//    }

    @Resource
    UserService userService;

//    @Test
//    public void addUser(){
//        User user = new User();
//        user.setUsername("qwqw");
//        user.setUserpassword("212");
//        boolean result = userService.insertUse(user);
//        System.out.println("User Test is     :  "+result);
//    }

    @Test
    public void testQueryAll(){
        List<User> users = userService.queryName("qwqw");
        if(users != null){
            for(int i = 0; i < users.size(); i++){
                System.out.println(users.get(i));
            }
        }
    }

}
