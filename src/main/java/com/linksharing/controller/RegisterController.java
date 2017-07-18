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
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by hackerfreak on 18/7/17.
 */
@Controller
public class RegisterController {

    @Autowired
    @Qualifier(value = "circle1")
    UserService userService;

    @RequestMapping("/")
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }


    @RequestMapping(value = "/register",method = RequestMethod.POST)
    ModelAndView registerUser(@ModelAttribute User user, @RequestParam("userImage") MultipartFile file) {


            String path="../../../../../../UserImages/";
        try {/*
            File file1=new File(user.getUsername()+".jpg");
            file.transferTo(file1);*/
            byte[] bytes=file.getBytes();
            Path path1= Paths.get(path+user.getUsername()+".jpg");
            Files.write(path1,bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        user.setFilePath(path+user.getUsername()+".jpg");
        UserService us = new UserService();
        us.saveUser(user);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("result");
        mv.addObject("username", user.getFname());
        return mv;
    }
}
