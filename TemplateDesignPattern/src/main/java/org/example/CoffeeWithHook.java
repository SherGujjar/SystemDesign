package org.example;

import java.util.Scanner;

public class CoffeeWithHook extends CaffineBaverages{
    @Override
    public void brew() {
        System.out.println("Brewing the coffee");
    }

    @Override
    public void addContainments() {
        System.out.println("Adding the milk and suggar");
    }

    @Override
    public boolean wantoToAddContainments() {
         return getAnswer();
    }

    private boolean getAnswer(){
        System.out.println("Enter 'Y' if you want to add containments else 'N'");
        Scanner s = new Scanner(System.in);
        String in = s.nextLine();
        if(in.equalsIgnoreCase("y")) {
            return true;
        }
        else{
            return false;
        }
    }
}
