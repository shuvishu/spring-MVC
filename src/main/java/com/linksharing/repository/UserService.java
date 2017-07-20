package com.linksharing.repository;

import com.linksharing.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.*;
import org.springframework.web.multipart.MultipartFile;

import javax.management.Query;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Properties;

/**
 * Created by hackerfreak on 18/7/17.
 */
public class UserService implements IUserRepository{
    private SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();

    public void saveUser(User user, MultipartFile multipartFile,String path)
    {

        try {
            byte[] bytes=multipartFile.getBytes();
            Path path1= Paths.get(path+user.getUsername()+".jpg");
            Files.write(path1,bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        user.setFilePath(path+user.getUsername()+".jpg");
        Session session=sessionFactory.openSession();
        session.beginTransaction();

        session.save(user);
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();



    }

    public Boolean checkUser(User user)
    {
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        org.hibernate.query.Query query=session.getNamedQuery("checkUserName");
        query.setParameter("name",user.getUsername());
        query.setParameter("email",user.getEmail());
        List<User> list=query.list();
        if(list.isEmpty())
        {
            session.close();
            return true;
        }
        session.close();
        return false;
    }

    public Boolean checkForgotUser(String usernameOrPassword)
    {
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        org.hibernate.query.Query query=session.getNamedQuery("checkUserName");
        query.setParameter("name",usernameOrPassword);
        query.setParameter("email",usernameOrPassword);
        List<User> list=query.list();
        if(list.isEmpty())
        {
            session.close();
            return true;
        }
        session.close();
        return false;
    }


    public void sendEmailToUser(String email){

        String To=email;
        String From="mamtalbism@gmail.com";
        String host="localhost";

        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        Session session = Session.

    }


    @Override
    public Boolean updateUser(User user) {
        return null;
    }

    @Override
    public User registerUser(User user) {
        return null;
    }

    @Override
    public User getUser(String userNameOrmail) {
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        org.hibernate.query.Query query=session.getNamedQuery("fetchEmail");
        query.setParameter("username",userNameOrmail);
        query.setParameter("email",userNameOrmail);
        User user=(User) query.getParameterValue(0);
        return user;
    }
}
