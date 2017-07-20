package com.linksharing.dto;

/**
 * Created by hackerfreak on 19/7/17.
 */
public class UserDTO {
  private   String userName;

    private   String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
