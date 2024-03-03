package org.example.Observable;

import org.example.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable{

    List<NotificationAlertObserver> observerList = new ArrayList<>();
    int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        for(NotificationAlertObserver observer : observerList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStock) {
        if(stockCount==0){
            notifySubscriber();
        }
        if(newStock==0){
            stockCount =0;
        }
        stockCount+=newStock;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
