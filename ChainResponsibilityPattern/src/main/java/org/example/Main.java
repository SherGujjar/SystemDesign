package org.example;

public class Main {
    public static void main(String[] args) {
        Logger log = new InfoLogger(new DebugLogger(new ErrorLogger(null)));

        log.log(log.INFO,"Just for Info");
        log.log(log.ERROR,"Error Occured");
        log.log(log.DEBUG,"Just for Debug");
    }
}