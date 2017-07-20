package com.linksharing.repository;

import com.linksharing.model.User;

public interface IUserRepository {

    public Boolean updateUser(User user);

    public User registerUser(User user);

    public User getUser(String userName );
}
