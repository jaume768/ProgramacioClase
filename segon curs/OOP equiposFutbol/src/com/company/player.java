package com.company;

public class player {

    private int id;
    private String name;
    private int number;
    private String team;
    private int goals;

    public player(int id,String name, int number, String team,int goals){

        this.id = id;
        this.name = name;
        this.number = number;
        this.team = team;
        this.goals = goals;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setgoals(int goals) {
        this.goals = goals;
    }

    public int getgoals() {
        return goals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
