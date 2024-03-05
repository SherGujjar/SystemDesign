package org.example;

public class Main {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        Remote remote = new Remote();
        remote.setCommand(new TurnOnCommand(ac));
        remote.pressButton();
        remote.undo();
    }
}