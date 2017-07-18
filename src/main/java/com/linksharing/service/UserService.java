package com.linksharing.service;

import com.linksharing.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by hackerfreak on 18/7/17.
 */
public class UserService extends User {
    private SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
    public void saveUser(User user)
    {
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
        return false;
    }
}
