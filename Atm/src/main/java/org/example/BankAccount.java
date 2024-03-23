package org.example;

public class BankAccount {

    private String accountNo;
    private String name;
    private int amount;

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void updateBalance(int amountWithdrawn){
        this.amount = this.amount -  amountWithdrawn;
    }
}
