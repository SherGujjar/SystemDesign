package org.example.ChainOfResponsiblity;

import org.example.Atm;

public class TwoThousandCashWithDrawProcedure extends CashWithDrawProcedure{
    public TwoThousandCashWithDrawProcedure(CashWithDrawProcedure cashWithDrawProcedure) {
        super(cashWithDrawProcedure);
    }

    public void withDrawCash(Atm atm, int cashtoWithDraw){
        int required = cashtoWithDraw/2000;
        int balance = cashtoWithDraw%2000;

        if(required <= atm.getNoOfTwoThosandNotes()) {
            atm.deductTwoThousandNotes(required);
        }
        else if(required > atm.getNoOfTwoThosandNotes()) {
            atm.deductTwoThousandNotes(atm.getNoOfTwoThosandNotes());
            balance = balance + (required-atm.getNoOfTwoThosandNotes()) * 2000;
        }

        if(balance != 0){
            super.withDrawCash(atm, balance);
        }

    }
}
