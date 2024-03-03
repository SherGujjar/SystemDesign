package org.example.Observer;

import org.example.Observable.StockObservable;

public class MobileNotifier implements NotificationAlertObserver{

    public StockObservable stockObservable;
    String number;

    public MobileNotifier(StockObservable stockObservable,String number){
        this.stockObservable = stockObservable;
        this.number = number;
    }

    @Override
    public void update() {
        sendMessage(number,"Notification send on the given mobile");
    }

    private void sendMessage(String number, String msg){
        System.out.println(msg+" "+number);
    }
}
