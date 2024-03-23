package org.example.States;

import org.example.Atm;
import org.example.Card;

public class InsertState extends AtmState{

    @Override
    public void insertCard(Atm atm, Card card) {
        System.out.println("Please enter your card");
        atm.setCurrentState(new HasCardStat());
    }
}
