package com.linksharing.controller;

import com.linksharing.model.User;
import com.linksharing.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hackerfreak on 18/7/17.
 */
@Controller
public class RegisterController {

    @RequestMapping("/")
    ModelAndView index(){
        ModelAndView modelAndView=new ModelAndView("index");
        return modelAndView;
    }


    @RequestMapping("/register")
    ModelAndView registerUser(@ModelAttribute User user)
    {
        UserService us=new UserService();
        us.saveUser(user);
        ModelAndView mv=new ModelAndView();
        mv.setViewName("result");
        mv.addObject("username",user.getFname());
        return mv;
    }
}
