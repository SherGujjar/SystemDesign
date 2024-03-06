package org.example;

public class InfoLogger extends Logger{
    InfoLogger(Logger nextLogger) {
        super(nextLogger);
    }

    public void log(int level,String message){
        if(level==INFO){
            System.out.println("INFO: "+message);
        }
        else{
            super.log(level,message);
        }
    }
}
