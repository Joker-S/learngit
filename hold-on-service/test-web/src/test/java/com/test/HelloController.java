//package com.test.controller;
//
//import com.test.service.Login;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * Created by songzheqi on 15/8/19.
// */
//@Controller
//public class HelloController extends HttpServlet {
//
//    @RequestMapping("/index")
//    public String hello(Model model){
//        model.addAttribute("tag",123);
//        return "index";
//    }
//    @RequestMapping("/hello")
//    public String hello(HttpServletRequest request,HttpServletResponse response) throws IOException {
//        String uname = request.getParameter("uname");
//        String upass = request.getParameter("upass");
//        Login login = new Login();
//        boolean result = login.login(uname, upass);
//        System.out.println("result is : " + result);
//        if (result) {
//            request.setAttribute("res", "login success!");
//        } else {
//            request.setAttribute("res", "login fail!");
//        }
//        return "hello";
//    }
//}
