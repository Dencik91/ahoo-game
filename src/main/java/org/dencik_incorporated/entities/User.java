package org.dencik_incorporated.entities;

import java.util.Objects;

public class User {
    private String userName;

    public User () {}

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return this.userName.equals(((User)o).getUserName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(userName);
    }
}
