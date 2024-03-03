package org.example.Observer;

import org.example.Observable.StockObservable;

public class EmailNotifier implements NotificationAlertObserver{

    public StockObservable stockObservable;

    public String email;

    public EmailNotifier(StockObservable stockObservable, String email){
        this.stockObservable = stockObservable;
        this.email = email;
    }


    @Override
    public void update() {
        sendEmail(email,"Notification send to the email");
    }

    private void sendEmail(String email, String msg){
        System.out.println(msg+" "+email);
    }
}
