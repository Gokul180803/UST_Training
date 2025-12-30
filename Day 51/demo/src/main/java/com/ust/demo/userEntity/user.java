package com.ust.demo.userEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class user {
    @Id
    @GeneratedValue
    private Long ID;
    private String userName;
    private String password;
    private String roles;
    private String email;

    public user() {
    }

    public user(Long ID, String email, String password, String userName,String roles) {
        this.ID = ID;
        this.email = email;
        this.password = password;
        this.userName = userName;
        this.roles=roles;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
