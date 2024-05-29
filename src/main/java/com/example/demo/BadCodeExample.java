package com.example.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BadCodeExample {

    private static List<String> users;

    public static void main(String[] args) {
        users = new ArrayList<String>();

        addUser("Alice");
        addUser("Bob");
        addUser("Alice");

        System.out.println("Users: " + users);

        try {
            int result = divide(10, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void addUser(String user) {
        if (users.contains(user)) {
            return;
        }
        users.add(user);
    }

    public static int divide(int a, int b) {
        return a / b;
    }

}
