package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    Scanner scanner;
    ArrayList<Person> list;
    Person currentUser;

    public UserInterface(Scanner scanner, ArrayList list) {
        this.scanner = scanner;
        this.list = list;
        this.currentUser = null;
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
                currentUser = person;
                userScreen(currentUser);
                return;
            }
        }

        System.out.println("Wrong login or password, please try again");
        logIn();

    }

    private void userScreen(Person currentUser){
        System.out.println("Hello " + currentUser.getName() + " what do you want to do?");
        System.out.println("1. Change password");
        System.out.println("2. Run for Chairman");
        System.out.println("3. Vote");

        switch (readIntInput()) {
            case (1):
                currentUser.changePassword(scanner);
                break;

            case (2):
                System.out.println("\nBlablablablabla\n");
                break;
            case (3):
                System.exit(0);
            case (4):
                return;
            default:
                System.out.println("Incorrect choice, please try again");
        }

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
