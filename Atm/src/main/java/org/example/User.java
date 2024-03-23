package org.example;

public class User {
    BankAccount bankAccount;
    Card card;

    public User(BankAccount bankAccount){
        this.bankAccount = bankAccount;
        this.card = new Card(bankAccount);
    }

    public Card getCard(){
        return card;
    }
}
