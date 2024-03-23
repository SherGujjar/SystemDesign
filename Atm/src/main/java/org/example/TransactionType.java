package org.example;

public enum TransactionType {
     CASH_WITHDRAW,
     CHECK_BALANCE;

     public static void showAllTransactions(){
         for(TransactionType type : TransactionType.values()){
             System.out.println(type.name());
         }
     }



}
