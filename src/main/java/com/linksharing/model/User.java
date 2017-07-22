package com.linksharing.model;

import javax.persistence.*;

/**
 * Created by hackerfreak on 18/7/17.
 */


@NamedQueries({
        @NamedQuery(name="checkUserName", query = "from user u where u.username=:name or u.email=:email"),
        @NamedQuery(name="checkLoginCredentials",query = "from user lg where lg.username=:username AND lg.password=:password"),
        @NamedQuery(name = "fetchEmail",query = "from user t where t.email=:email or t.username=:username"),
        @NamedQuery(name = "fetchByuname",query = "from user u where u.username=:usertofetch"),
        @NamedQuery(name="test",query = "update user u set u.password=:password where u.username=:username")
})




@Entity(name = "user")
public class User {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String username;
    private String email;
    private String password;
    private String fname;
    private String lname;
    private String filePath;

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }


    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }
}
