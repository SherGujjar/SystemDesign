package org.example;

public class Car implements Vehicle{
    @Override
    public int getTyres() {
        return 4;
    }

    @Override
    public int doors() {
        return 5;
    }
}
