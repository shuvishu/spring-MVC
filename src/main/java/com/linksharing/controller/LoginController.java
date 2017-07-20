package com.linksharing.controller;

import com.linksharing.dto.UserDTO;
import com.linksharing.model.User;
import com.linksharing.repository.UserService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by hackerfreak on 19/7/17.
 */





@Controller
public class LoginController {


    @RequestMapping(name = "/login",method = RequestMethod.POST)
    ModelAndView loginUser(@ModelAttribute UserDTO uc)
    {
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        Query query=session.getNamedQuery("checkLoginCredentials");
        query.setParameter("username",uc.getUserName());
        query.setParameter("password",uc.getPassword());
        List<User> list=query.list();
        if(list.isEmpty())
        {
            System.out.println("list is empty");
            ModelAndView mv=new ModelAndView("errorPage");

            return mv;
        }
        else {

            User user=list.get(0);



            ModelAndView mv=new ModelAndView("result");
            mv.addObject("username",user.getUsername());
            mv.addObject("path",user.getFilePath());
            return mv;
        }


    }
}
