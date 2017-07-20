package com.linksharing.controller;

import com.linksharing.model.User;
import com.linksharing.repository.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;

/**
 * Created by hackerfreak on 18/7/17.
 */
@Controller
public class RegisterController {

    @Autowired
    @Qualifier(value = "circle1")
    UserService userService;

    @Autowired
    ServletContext context;

    @RequestMapping("/")
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }


    @RequestMapping(value = "/register",method = RequestMethod.POST)
    ModelAndView registerUser(@ModelAttribute User user, @RequestParam("userImage") MultipartFile file) {

        String path="/media/hackerfreak/New Volume/Java JEE/TTN Idea proj/LinkSharingGradle/UserImages/";
        UserService us = new UserService();
        if(us.checkUser(user))
        {
            us.saveUser(user,file,path);
            ModelAndView mv = new ModelAndView();
            mv.setViewName("result");
            mv.addObject("username", user.getFname());
            return mv;
        }

        else {
            ModelAndView mv = new ModelAndView();
            mv.setViewName("errorPage");

            return mv;
        }

    }


    @RequestMapping(name = "/forgot",method = RequestMethod.GET)
    ModelAndView forgotPassword(){
        ModelAndView modelAndView=new ModelAndView("forgotPassword");
        return modelAndView;
    }




}
