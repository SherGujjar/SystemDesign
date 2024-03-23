package org.example.States;

import org.example.Atm;
import org.example.Card;
import org.example.ChainOfResponsiblity.CashWithDrawProcedure;
import org.example.ChainOfResponsiblity.FiveHundredWithDrawProcedure;
import org.example.ChainOfResponsiblity.OneHundredWithDrawProcedure;
import org.example.ChainOfResponsiblity.TwoThousandCashWithDrawProcedure;

public class CashWithdrawState extends AtmState{

    @Override
    public void cashWithdrawleState(Atm atm, Card card, int amuontToDeduct) {
        if(atm.getAtmBalance()<amuontToDeduct){
            System.out.println("Insufficient amount in Atm");
            exit(atm);
        }
        else if(card.getBalance()<amuontToDeduct){
            System.out.println("Insufficient Amount in your bank");
            exit(atm);
        }
        else{
            card.deductBankBalance(amuontToDeduct);
            CashWithDrawProcedure cashWithDrawProcedure = new TwoThousandCashWithDrawProcedure(new FiveHundredWithDrawProcedure( new OneHundredWithDrawProcedure(null)));
            cashWithDrawProcedure.withDrawCash(atm,amuontToDeduct);
            exit(atm);
        }
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
