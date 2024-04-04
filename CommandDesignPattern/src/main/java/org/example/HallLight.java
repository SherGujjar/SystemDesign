package org.example;

public class HallLight implements Light{
    @Override
    public void on() {
        System.out.println("Hall Light turned on");
    }

    @Override
    public void off() {
        System.out.println("Hall Light turned off");
    }
}
