package org.example;

import java.util.Stack;

public class Remote {

    Stack<Command> commandsStack = new Stack<>();

    Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void pressButton(){
        commandsStack.add(command);
        command.execute();
    }

    public void undo(){
        while (!commandsStack.isEmpty()){
            Command last = commandsStack.pop();
            last.undo();
        }
    }

}
