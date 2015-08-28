package com.test.controller;

import com.test.domain.User;
import com.test.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by songzheqi on 15/8/21.
 */
@Controller
public class LoginController {
    @Resource
    UserService userService;
//    @RequestMapping("index")
//    public String hello(Model model){
//        model.addAttribute("tag", 123);
//        return "index";
//    }
//    @RequestMapping("success")
//    public String login(@RequestParam("uname")String username, @RequestParam("upass")String password) {
//        System.out.println("name is    " + username + "upass is :   " + password);
//        User user = new User();
//        user.setUserpassword(password);
//        user.setUsername(username);
//        if (userService.login(user)) {
//            return "success";
//        }
//        return "fail";
//    }
//
//    @RequestMapping("query")
//    public String querytest(Model model){
//        model.addAttribute("tag", 123);
//        return "query";
//    }
//
    @RequestMapping("/result")
    public String result(Model model){
        return "result";
    }
//
//    @RequestMapping(value = "page1")
//    public ModelAndView toPage1() {
//        return new ModelAndView("page1");
//    }

    @RequestMapping(value="login.do")
    public @ResponseBody
    Map<String, Object> login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("name");
        Map<String,Object> map = new HashMap<String,Object>();
        ArrayList<String> list = new ArrayList<String>();
        if(username.equals("")){
            List<User> users = userService.queryAll();
            if(users != null){
                for(int i = 0; i < users.size(); i++){
                    System.out.println(users.get(i).getUsername());
                    list.add(users.get(i).getUsername());
                    map.put("msg1",users.get(i).getUserpassword());
                }
                map.put("list", list);
            }

        }else{
            List<User> users = userService.queryName(username);
            for(int i = 0; i < users.size(); i++){
                list.add(users.get(i).getUsername());
                System.out.println(users.get(i).getUsername());
                map.put("msg", users.get(i).getUsername());
                map.put("msg1",users.get(i).getUserpassword());
            }
            map.put("list", list);
        }
        return map;
    }


}
