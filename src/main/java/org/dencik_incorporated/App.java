package org.dencik_incorporated;

import org.dencik_incorporated.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        List<User> users = new ArrayList<>(); //SO[L]I[D]



        while(users.size()<5) {
            users.add(new User(String.format("user %d",users.size()+1)));
        }

        for (User user : users) {
            System.out.println(user);
        }
        System.out.println("users: " + users.size());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu pozitia: ");
        int i = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introdu username ");
        String value = scanner.nextLine();

        users.get(i).setUserName(value);

        users.forEach(System.out::println);

    }
}
