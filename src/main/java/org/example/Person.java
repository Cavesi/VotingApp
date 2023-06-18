package org.example;

import java.util.Scanner;

public class Person {
    private String id;
    private String name;
    private String secondName;
    private Candidate  candidateObject = null;
    private boolean isRunningForChairman;
    private boolean hasVoted;
    private String password;

    public Person(String id, String name, String secondName, String password) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.isRunningForChairman = false;
        this.hasVoted = false;
        this.password = password;
    }

    public void runForChairman(){
        isRunningForChairman = true;
        candidateObject = new Candidate(this.id, this.name, this.secondName);
    }

    public boolean isRunningForChairman() {
        return isRunningForChairman;
    }

    public boolean hasVoted() {
        return hasVoted;
    }

    public void setHasVoted() {
        this.hasVoted = true;
    }

    public String candidateInfo(){
        if (isRunningForChairman) {
            return candidateObject.toString();
        }
        return name + " " + secondName + " is not running for Chairman";
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(Scanner scanner) {
        System.out.println("Old password: ");
        String oldPassword = scanner.nextLine();
        System.out.println("New password: ");
        String newPassword = scanner.nextLine();
        System.out.println("Confirm new password: ");
        String confirmedNewPassword = scanner.nextLine();

        if (oldPassword.equals(password) && newPassword.equals(confirmedNewPassword)) {
            password = newPassword;
        }

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public Candidate getCandidateObject() {
        return candidateObject;
    }
}
