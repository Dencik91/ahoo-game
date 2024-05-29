package org.dencik_incorporated;

import com.github.javafaker.Faker;
import org.dencik_incorporated.entities.User;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main( String[] args ) {
        // Folosind fakerul de umplut o lista cu 10 useri
        // de copiat toti userii numele carora incepe cu a in alta lista
        // de afisat ambele liste


        List<User> users = createList(30);
        List<User> usersFinal = filterList("a", users);

        users.forEach(System.out::println);
        System.out.println();
        usersFinal.forEach(System.out::println);

    }

    public static List<User> createList(int size) {
        Faker faker = new Faker();
        List<User> users = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            users.add(new User(faker.name().username()));
        }
        return users;
    }

    public static List<User> filterList(String prefix, List<User> list) {
        List<User> usersFinal = new ArrayList<>();
        for (User user : list) {
            if (user.getUserName().startsWith(prefix)) {
                usersFinal.add(user);
            }
        }
        return usersFinal;
    }
}
