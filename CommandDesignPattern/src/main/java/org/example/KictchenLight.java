package org.example;

public class KictchenLight implements Light{
    @Override
    public void on() {
        System.out.println("KitchenLight is turned on");
    }

    @Override
    public void off() {
        System.out.println("KitchenLight is turned off");
    }
}
