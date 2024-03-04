package org.example;

public class Book {
    int price;
    String name;
    public Book(int price,String name){
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
