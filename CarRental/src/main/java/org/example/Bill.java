package org.example;

public class Bill {

    private Reservation reservation;

    public boolean isPaid;
    public double amount;

    public Bill(Reservation reservation){
        this.reservation = reservation;
        this.amount = computeBillAmount();
        this.isPaid = false;
    }

    private double computeBillAmount(){
        return 100.0;
    }




}
