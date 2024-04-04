package org.example;

public class SingletonClass {
    private static SingletonClass uniqueSingleObject;

    private SingletonClass(){}

    public static SingletonClass getInsance(){
        if(uniqueSingleObject==null){
            uniqueSingleObject = new SingletonClass();
        }
        return uniqueSingleObject;
    }
}
