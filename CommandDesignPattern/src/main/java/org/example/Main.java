package org.example;

public class Main {
    public static void main(String[] args) {
       Remote remote = new Remote(4);
       HallLight hallLight = new HallLight();
       KictchenLight kictchenLight = new KictchenLight();



       remote.setCommand(new TurnOnCommand(hallLight),0);
       remote.setCommand(new TurnOffCommand(hallLight),1);
       remote.setCommand(new TurnOnCommand(kictchenLight),2);
       remote.setCommand(new TurnOffCommand(kictchenLight),3);

        System.out.println(remote);

       remote.pressButton(3);

       remote.undoButton();

       remote.pressButton(2);

       remote.undoButton();

       remote.pressButton(0);

       remote.pressButton(1);

    }
}