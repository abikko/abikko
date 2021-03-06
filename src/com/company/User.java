package com.company;

import java.util.Arrays;
import java.util.List;

public class User {
    // id (you need to generate this id by static member variable)
    // name, surname
    // username
    // password
    private String username,name,surname;
    private static int id =0;
    private Password password;

    public User(){
        id++;
    }

    public User(String username, String name, String surname, String Password) {
        this();
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.password = new Password(Password); // Composition in here
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        User.id = id;
    }
}
