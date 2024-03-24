package org.example;

public class Payment {
    private Bill bill;

    public Payment(Bill bill){
        this.bill = bill;
    }

    public void payBill(){
        System.out.println("Bill Payment done Successfully of amount "+bill.amount);
        bill.isPaid = true;
    }

}
