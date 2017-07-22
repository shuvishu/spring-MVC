package com.linksharing.controller;


import com.linksharing.dto.UserPasswordUpdater;
import com.linksharing.repository.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ForgotPasswordResolver {


    @RequestMapping(value = "/validateAndSendmail",method = RequestMethod.POST)
    ModelAndView validateAndSendmail(@RequestParam("username") String usernameOrPassword){
        ModelAndView mv=new ModelAndView();

        UserService userService=new UserService();
        if(!userService.checkForgotUser(usernameOrPassword))
        {
            userService.sendEmailToUser(usernameOrPassword);
            mv.setViewName("uexist");
            mv.addObject("email",userService.fetchEmail(usernameOrPassword));
        }
        else{
            mv.setViewName("udexist");
        }

        return mv;
    }


    @RequestMapping(value = "/reset",method = RequestMethod.GET)
    ModelAndView resetPage()
    {
        return new ModelAndView("resetPassword");
    }

    @RequestMapping(value = "/ResetPassword",method = RequestMethod.POST)
    void updatePassword(@ModelAttribute UserPasswordUpdater updater){


    }
}
