package org.example;

import org.example.Observable.IphoneStockObservable;
import org.example.Observer.EmailNotifier;
import org.example.Observer.MobileNotifier;

public class Main {
    public static void main(String[] args) {
        IphoneStockObservable iphoneStockObservable = new IphoneStockObservable();
        iphoneStockObservable.add(new EmailNotifier(iphoneStockObservable,"sher@gmail.com"));
        iphoneStockObservable.add(new MobileNotifier(iphoneStockObservable,"9667460441"));
        iphoneStockObservable.setStockCount(10);
        iphoneStockObservable.setStockCount(0);
        iphoneStockObservable.setStockCount(10);
    }
}