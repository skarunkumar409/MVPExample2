package com.example.hp.mvpexample;

public class User {
    public User() {
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
    }

    private String fullName = "", email = "";

    @Override
    public String toString() {
        return "Email : " + email + "\nFullName : " + fullName;
    }
}
