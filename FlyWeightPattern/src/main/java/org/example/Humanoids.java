package org.example;

public class Humanoids implements Irobot{

    private String type;

    private Spirit spirit;

    public Humanoids(String type, Spirit spirit){
        this.type = type;
        this.spirit = spirit;
    }

    public String getType() {
        return type;
    }

    public Spirit getSpirit() {
        return spirit;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Human robot present at x = "+x+" and y = "+y);
    }

}
