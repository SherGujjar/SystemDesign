package org.example;

public abstract class CaffineBaverages {

    final void prepareDrink(){
        boilWater();
        brew();
        pourIntoCup();
        if(wantoToAddContainments()){
            addContainments();
        }
    }
    private void boilWater(){
        System.out.println("Started boiling the water");
    }

    private void pourIntoCup(){
        System.out.println("Pouring the drink into the cup");
    }

    public abstract void brew();

    public abstract void addContainments();

    // just an hook
    public boolean wantoToAddContainments(){
        return true;
    }
}
