package org.dencik_incorporated;

import com.github.javafaker.Faker;
import org.dencik_incorporated.entities.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
    public static void main( String[] args ) {
        // create a set of unique users
        Set<User> users = new HashSet<>();

        users.add(new User("user 1"));
        User user = new User("User 2");
        users.add(user);
        users.add(new User("user 3"));
        users.add(user);

        users.forEach(System.out::println);
        for (User player : users) {
            System.out.println(Integer.toUnsignedString(player.hashCode()));
        }
    }
}
