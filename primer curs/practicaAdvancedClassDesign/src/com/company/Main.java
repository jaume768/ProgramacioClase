package com.company;

import prova.PowerState;

public class Main {

    public static void main(String[] args) {

        computer com = new computer();

        com.setState(PowerState.SUSPEND);
    }
}
