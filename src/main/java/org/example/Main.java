package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("1", "Ania", "Ania", "1"));
        list.add(new Person("2", "Ania", "Bania", "2"));
        list.add(new Person("3", "Ania", "Cania", "3"));
        list.add(new Person("4", "Ania", "Dania", "4"));
        list.add(new Person("5", "Ania", "Eania", "5"));
        list.add(new Person("6", "Ania", "Fania", "6"));

        UserInterface ui = new UserInterface(scanner, list);
        ui.go();
    }
}