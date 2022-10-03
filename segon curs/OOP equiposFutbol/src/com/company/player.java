package com.company;

public class player {

    private int id;
    private String name;
    private int number;
    private String team;

    public player(int id,String name, int number, String team){

        this.id = id;
        this.name = name;
        this.number = number;
        this.team = team;

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
