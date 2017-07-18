package com.linksharing.repository;

import com.linksharing.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by hackerfreak on 18/7/17.
 */
public class UserService implements IUserRepository{
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

    @Override
    public Boolean updateUser(User user) {
        return null;
    }

    @Override
    public User registerUser(User user) {
        return null;
    }

    @Override
    public User getUser(String userName) {
        return null;
    }
}
