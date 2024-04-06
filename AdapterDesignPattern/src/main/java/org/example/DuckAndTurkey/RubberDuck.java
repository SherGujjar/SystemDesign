package org.example.DuckAndTurkey;

public class RubberDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("I am quacking");
    }

    @Override
    public void fly() {
        System.out.println("I am not able to fly");
    }
}
