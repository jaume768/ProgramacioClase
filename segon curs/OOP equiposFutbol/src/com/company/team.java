package com.company;
import java.util.ArrayList;

public class team {

    private int id;
    private String name;
    ArrayList<player> players = new ArrayList<>();

    public team(int id, String name){

        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayers(int id,String name, int number, String team, int goals) {

        players.add(new player(id,name,number,team,goals));

    }

    public ArrayList<player> getPlayers() {
        return players;
    }

}
