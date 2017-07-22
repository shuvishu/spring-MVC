package com.linksharing.repository;

import com.linksharing.dto.UserPasswordUpdater;
import com.linksharing.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.*;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
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


        User em=new UserService().getUser(email);
        String From ="mamtalbism@gmail.com";
        String To=em.getEmail();
        String password="pmamtalbism";


        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        //get Session
        javax.mail.Session session = javax.mail.Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(From,password);
                    }
                });
        //compose message
        try {
            MimeMessage message = new MimeMessage(session);
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(To));
            message.setSubject("hi "+em.getFname()+" here is your password");
            message.setText(em.getPassword()+" how ever you may click the following link to reset the password Http://localhost:8080/reset?username="+em.getUsername());
            //send message
            Transport.send(message);
            System.out.println("message sent successfully");
        } catch (MessagingException e) {throw new RuntimeException(e);}


}


    @Override
    public Boolean updateUser(User user) {
        return null;
    }

    @Override
    public User registerUser(User user) {
        return null;
    }



    public void getUserBUserName(String username, UserPasswordUpdater updater)
    {
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        org.hibernate.query.Query query=session.getNamedQuery("fetchByuname");
        query.setParameter("usertofetch",updater.getUname());
        User user= (User) query.getSingleResult();
        user.setPassword(updater.getPassword());
        session.save(user);
        session.getTransaction().commit();
        session.close();

    }

    @Override
    public User getUser(String userNameOrmail) {
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        org.hibernate.query.Query query=session.getNamedQuery("fetchEmail");
        query.setParameter("username",userNameOrmail);
        query.setParameter("email",userNameOrmail);
        User user=(User) query.getSingleResult();
        return user;
    }
    public String fetchEmail(String userNameOrmail) {
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        org.hibernate.query.Query query=session.getNamedQuery("fetchEmail");
        query.setParameter("username",userNameOrmail);
        query.setParameter("email",userNameOrmail);
        User user=(User) query.getSingleResult();
        return user.getEmail();
    }
}
