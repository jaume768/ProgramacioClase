package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        team equip1 = new team(1,"PSG");

        equip1.setPlayers(1,"Tomeu",1,equip1.getName());
        equip1.setPlayers(2,"Fran",1,equip1.getName());
        equip1.setPlayers(3,"Mariscal",1,equip1.getName());

        System.out.println(equip1.getPlayers().get(0).getName());
    }
}
