package org.example;

public abstract class Payment {

    public abstract void validate();
    public abstract void debit();
    public abstract void calculateFee();
    public abstract void credit();


    public final void sendMoney(){
        validate();
        debit();
        calculateFee();
        credit();
    }

}
