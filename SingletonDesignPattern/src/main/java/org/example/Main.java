package org.example;

public class Main {
    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getInsance();
        SingletonClass singletonClass1 = SingletonClass.getInsance();
        System.out.println(singletonClass1);
        System.out.println(singletonClass);
    }
}