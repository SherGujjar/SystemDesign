package org.example.ChainOfResponsiblity;

import org.example.Atm;

public class CashWithDrawProcedure {

    CashWithDrawProcedure nextProcedure;

    public CashWithDrawProcedure(CashWithDrawProcedure cashWithDrawProcedure){
        this.nextProcedure = cashWithDrawProcedure;
    }

    public void withDrawCash(Atm atm, int cashtoWithDraw){
        if(nextProcedure!=null){
            nextProcedure.withDrawCash(atm,cashtoWithDraw);
        }
    }

}
