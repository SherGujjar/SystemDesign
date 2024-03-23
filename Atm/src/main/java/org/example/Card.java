package org.example;

public class Card {
    private BankAccount bankAccount;

    private String cvv;
    private String expiry;
    private String name;

    static int PIN_NUMBER = 122333;

    public Card(BankAccount bankAccount){
        this.bankAccount = bankAccount;
    }

    public boolean isCorrectPin(int pin){
        if(pin==PIN_NUMBER){
            return true;
        }
        return false;
    }

    public int getBalance(){
        return bankAccount.getAmount();
    }

    public void deductBankBalance(int amount){
         bankAccount.updateBalance(amount);
    }

}
