package org.example;

public abstract class Logger {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    Logger nextLogger;

    Logger(Logger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void log(int level,String message){
        if(nextLogger!=null){
            nextLogger.log(level,message);
        }
    }


}
