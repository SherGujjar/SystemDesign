package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Atm atm  = new Atm(1,3,7);
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAmount(3000);
        User user = new User(bankAccount);
        AtmRoom atmRoom = new AtmRoom(user,atm);
        atmRoom.withDraw();

    }

}