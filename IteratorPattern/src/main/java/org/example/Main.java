package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(200,"DSA"));
        bookList.add(new Book(300,"OOPS"));
        bookList.add(new Book(400,"CN"));
        bookList.add(new Book(350,"OS"));

        Library library = new Library(bookList);
        Iterator iterator = library.createIterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next.toString());
        }
    }
}