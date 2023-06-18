package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    Scanner scanner;
    ArrayList<Person> list;

    public UserInterface(Scanner scanner, ArrayList list) {
        this.scanner = scanner;
        this.list = list;
    }

    public void go() {
        while (true) {
            helloScreen();
        }
    }

    public void helloScreen() {

        System.out.println("Hello, how can i help you?");
        System.out.println("1. Log In");
        System.out.println("2. Help");
        System.out.println("3. Exit");

        switch (readIntInput()) {
            case (1):
                logIn();
                break;
            case (2):
                System.out.println("\nBlablablablabla\n");
                break;
            case (3):
                System.exit(0);
            default:
                System.out.println("Incorrect choice, please try again");


        }

    }

    public int readIntInput() {

        String value = scanner.nextLine();
        while (!isInteger(value)) {
            System.out.println("Written value is not a number, try again.");
            value = scanner.nextLine();
        }
        return Integer.valueOf(value);
    }

    public void logIn() {
        System.out.println("Login: ");
        String login = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();

        for (Person person : list) {
            if (person.getId().equals(login) && person.getPassword().equals(password)) {
                System.out.println("Logged in correctly");
                return;
            }
        }

        System.out.println("Wrong login or password, please try again");
        logIn();

    }

    private boolean isInteger(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
