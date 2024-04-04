package org.example;

public class Remote {
    Command[] buttons ;

    Command prevCommand;

    public Remote(int size){
        buttons = new Command[size];
        for(int i=0;i<size;i++){
            buttons[i] = new NoCommand();
        }
    }

    public void setCommand(Command command, int slot){
        buttons[slot] = command;
    }

    public void pressButton(int slot){
        Command command = buttons[slot];
        prevCommand = command;
        command.execute();
    }

    public void undoButton(){
        prevCommand.undo();
    }

    @Override
    public String toString(){
        StringBuilder cb = new StringBuilder();
        cb.append("Current State of remote \n");
        for(int i=0;i<buttons.length;i++){
            cb.append("Slot "+i+" has command "+buttons[i]+"\n");
        }
        return cb.toString();
    }
}
