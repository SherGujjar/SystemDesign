package org.example;

public class Main {
    public static void main(String[] args) {
        Payment p1 = new PaytoFriend();
        Payment p2 = new PayToMerchant();
        p1.sendMoney();
        p2.sendMoney();
    }
}