package org.example;

public class PayToMerchant extends Payment{
    @Override
    public void validate() {
        System.out.println("Validated the Amount");
    }

    @Override
    public void debit() {
        System.out.println("Debited the Amount");
    }

    @Override
    public void calculateFee() {
        System.out.println("Take fees as 2.5 percent");
    }

    @Override
    public void credit() {
        System.out.println("Credit the amount");
    }
}
