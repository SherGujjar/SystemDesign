package org.example;

public class TurnOffCommand implements Command{
    AirConditioner ac;
    TurnOffCommand(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOff();
    }

    public void undo(){
        ac.turnOn();
    }
}
