package com.company;

import prova.PowerState;

public class computer extends  ElectronicDevice{

    private PowerState powerState;

    @Override
    public void turnOn() { powerState = powerState.ON;}

    @Override
    public void turnOff() { powerState = PowerState.OFF;}

    public void turnSuspend() { powerState = PowerState.SUSPEND;}

    public void setState(PowerState state){
        switch (state){
            case OFF :
                turnOff();
                break;
            case ON :
                turnOn();
                break;
            case SUSPEND:
                turnSuspend();
                break;
        }

        System.out.println(powerState.getDescripcio());
    }
}
