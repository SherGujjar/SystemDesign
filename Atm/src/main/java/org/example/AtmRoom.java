package org.example;

import org.example.States.AtmState;
import org.example.States.InsertState;

public class AtmRoom {

    User user;
    Atm atm;
    AtmRoom(User user,Atm atm){
        this.user = user;
        this.atm = atm;
    }

    public void withDraw(){
        System.out.println("Amount remianing in Atm is "+atm.getAtmBalance());
        atm.printCurrentATMStatus();
        Card card = user.getCard();
        atm.currentState.insertCard(atm,card);
        System.out.println("Card Inserted");
        atm.currentState.hasCardState(atm,card,122333);
        atm.currentState.optionSelectionState(atm,card,TransactionType.CASH_WITHDRAW);
        atm.currentState.cashWithdrawleState(atm,card,2800);
        atm.printCurrentATMStatus();
        System.out.println("Amount remaining in user accoutn is "+card.getBalance());
        System.out.println("Amount remianing in Atm is "+atm.getAtmBalance());

    }
}
