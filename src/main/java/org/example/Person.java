package org.example;

import java.time.LocalDate;

public class Person {
    private int id;
    private String name;
    private String secondName;

    private Candidate  candidateObject = null;
    private boolean isRunning;
    private boolean hasVoted;
    private LocalDate dateOfBirth;
    private String password;

    public Person(int id, String name, String secondName, LocalDate dateOfBirth, String password) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.isRunning = false;
        this.hasVoted = false;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
    }

    public void runForChairman(){
        isRunning = true;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public boolean isHasVoted() {
        return hasVoted;
    }

    public void setHasVoted(boolean hasVoted) {
        this.hasVoted = hasVoted;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
