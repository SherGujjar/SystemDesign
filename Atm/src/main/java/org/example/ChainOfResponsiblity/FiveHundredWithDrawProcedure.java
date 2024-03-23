package org.example.ChainOfResponsiblity;

import org.example.Atm;

public class FiveHundredWithDrawProcedure extends CashWithDrawProcedure{
    public FiveHundredWithDrawProcedure(CashWithDrawProcedure nextCashWithDrawProcedure) {
        super(nextCashWithDrawProcedure);
    }

    public void withDrawCash(Atm atm, int cashtoWithDraw){
        int required = cashtoWithDraw/500;
        int balance = cashtoWithDraw%500;

        if(required <= atm.getNoOfFiveHundredNotes()) {
            atm.deductFiveHunderedNotes(required);
        }
        else if(required > atm.getNoOfFiveHundredNotes()) {
            atm.deductFiveHunderedNotes(atm.getNoOfFiveHundredNotes());
            balance = balance + (required-atm.getNoOfFiveHundredNotes()) * 500;
        }
        if(balance != 0){
            super.withDrawCash(atm, balance);
        }


    }
}
