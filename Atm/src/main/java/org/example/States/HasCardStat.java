package org.example.States;

import org.example.Atm;
import org.example.Card;

public class HasCardStat extends AtmState{


    @Override
    public void hasCardState(Atm atm, Card card, int pin) {
        if(!card.isCorrectPin(pin)){
            System.out.println("Please enter correct password");
        }
        else{
            atm.setCurrentState(new SelectionState());
        }
    }
}
