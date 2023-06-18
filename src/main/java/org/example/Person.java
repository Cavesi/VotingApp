package org.example;

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

    public boolean isRunning() {
        return isRunningForChairman;
    }

    public void setRunningForChariman(boolean running) {
        isRunningForChairman = running;
    }

    public boolean hasVoted() {
        return hasVoted;
    }

    public void setHasVoted() {
        this.hasVoted = true;
    }

    public void getVote(){
        candidateObject.voteFor();
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

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }
}
