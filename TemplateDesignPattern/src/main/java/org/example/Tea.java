package org.example;

public class Tea extends CaffineBaverages{
    @Override
    public void brew() {
        System.out.println("Brewing the tea");
    }

    @Override
    public void addContainments() {
        System.out.println("Adding the milk and little lemor");
    }
}
