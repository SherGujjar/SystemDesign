package org.example.States;

import org.example.Atm;
import org.example.Card;
import org.example.TransactionType;

public abstract class AtmState {

    public void insertCard(Atm atm, Card crad){
        System.out.println("Something went wrong");
    }

    public void hasCardState(Atm atm, Card card, int pin){
        System.out.println("Something went wrong");
    }

    public void optionSelectionState(Atm atm, Card card, TransactionType type){
        System.out.println("Something went wrong");
    }

    public void cashWithdrawleState(Atm atm, Card card, int amountToDeduct){
        System.out.println("Something went wrong");
    }

    public void displayBalanceState(Atm atm , Card card){
        System.out.println("Something went wrong");
    }

    public void removeCardState(Atm atm){
        System.out.println("Something went wrong");
    }

    public void exit(Atm atm){
        System.out.println("Something went wrong");
    }

}
