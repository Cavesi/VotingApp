package org.example;

public class Candidate {
    private int id;
    private String name;
    private String secondName;
    private int votes;

    public Candidate(int id, String name, String secondName) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.votes = 0;
    }

    public boolean voteFor() {
        votes++;
    }

    public int getVotes() {
        return votes;
    }
}
