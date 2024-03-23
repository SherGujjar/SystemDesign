package org.example.States;

import org.example.Atm;
import org.example.Card;

public class CheckBalanceState extends AtmState {

    @Override
    public void displayBalanceState(Atm atm, Card card) {
        System.out.println("Your balance is "+card.getBalance());
    }

    @Override
    public void exit(Atm atm){
        removeCardState(atm);
        atm.setCurrentState(new InsertState());
        System.out.println("Exit happens");
    }

    @Override
    public void removeCardState(Atm atm) {
        System.out.println("Please remove your card");
    }
}
