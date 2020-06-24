package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by A.A.MAMUN on 6/24/2020.
 */
@Entity
public class AppUser {

    @Id
    private String email;
    private String password;

    public AppUser() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
