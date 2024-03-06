package org.example;

public class ErrorLogger extends Logger{
    ErrorLogger(Logger nextLogger) {
        super(nextLogger);
    }


    public void log(int level,String message){
        if(level==ERROR){
            System.out.println("ERROR: "+message);
        }
        else{
            super.log(level,message);
        }
    }
}
