package org.dencik_incorporated;

import org.dencik_incorporated.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        List<User> users = new ArrayList<>(); //SO[L]I[D]


        User user = null;
        while(users.size()<5) {
            users.add(new User(String.format("user %d",users.size()+1)));
        }

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserName().equals("user 3")) {
                users.remove(i);
                break;
            }
        }

        users.forEach(System.out::println);

    }
}
