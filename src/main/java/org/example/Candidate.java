package org.example;

public class Candidate {
    private String id;
    private String name;
    private String secondName;
    private int votes;

    public Candidate(String id, String name, String secondName) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.votes = 0;
    }

    public boolean voteFor() {
        votes++;
        return true;
    }

    public int getVotes() {
        return votes;
    }

    public String toString(){
        if (votes == 1) {
            return name + " " + secondName + " got 1 vote";
        }
        return name + " " + secondName + " got: " + votes + " votes";
    }
}
