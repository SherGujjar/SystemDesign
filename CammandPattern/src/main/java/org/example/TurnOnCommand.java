package org.example;

public class TurnOnCommand implements Command{
    AirConditioner ac;
    TurnOnCommand(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOn();
    }

    @Override
    public void undo(){
        ac.turnOff();
    }
}
