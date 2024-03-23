package org.example.ChainOfResponsiblity;

import org.example.Atm;

public class OneHundredWithDrawProcedure extends CashWithDrawProcedure{
    public OneHundredWithDrawProcedure(CashWithDrawProcedure nextCashWithDrawProcedure) {
        super(nextCashWithDrawProcedure);
    }

    public void withDrawCash(Atm atm, int cashtoWithDraw){
        int required = cashtoWithDraw/100;
        int balance = cashtoWithDraw%100;

        if(required <= atm.getNoOfOneHundredNotes()) {
            atm.deductOneHundredNotes(required);
        }
        else if(required > atm.getNoOfOneHundredNotes()) {
            atm.deductOneHundredNotes(atm.getNoOfOneHundredNotes());
            balance = balance + (required-atm.getNoOfOneHundredNotes()) * 100;
        }
        if(balance != 0){
            System.out.println("Something went wrong");
        }
        else{
            System.out.println("Transaction Completed SuccessFully");
        }


    }
}
