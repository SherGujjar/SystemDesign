package org.example;

import org.example.States.AtmState;
import org.example.States.InsertState;

public class Atm {
    AtmState currentState;

    private int atmBalance;
    int noOfTwoThosandNotes;
    int noOfFiveHundredNotes;

    public int getNoOfFiveHundredNotes() {
        return noOfFiveHundredNotes;
    }

    public int getNoOfOneHundredNotes() {
        return noOfOneHundredNotes;
    }

    public int getNoOfTwoThosandNotes() {
        return noOfTwoThosandNotes;
    }

    int noOfOneHundredNotes;


    public Atm(int noOfTwoThosandNotes,int noOfFiveHundredNotes,int noOfOneHundredNotes){
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
        this.noOfTwoThosandNotes = noOfTwoThosandNotes;
        this.noOfOneHundredNotes = noOfOneHundredNotes;
        currentState = new InsertState();
    }

    public int getAtmBalance(){
        return noOfFiveHundredNotes*500+noOfOneHundredNotes*100+noOfTwoThosandNotes*2000;
    }

    public AtmState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(AtmState currentState) {
        this.currentState = currentState;
    }

    public void deductTwoThousandNotes(int numerOfNotes){
        noOfTwoThosandNotes = noOfTwoThosandNotes-numerOfNotes;
    }

    public void deductFiveHunderedNotes(int numerOfNotes){
        noOfFiveHundredNotes = noOfFiveHundredNotes-numerOfNotes;
    }

    public void deductOneHundredNotes(int numerOfNotes){
        noOfOneHundredNotes = noOfOneHundredNotes-numerOfNotes;
    }

    public void printCurrentATMStatus(){
        System.out.println("Balance: " + atmBalance);
        System.out.println("2kNotes: " + noOfTwoThosandNotes);
        System.out.println("500Notes: " + noOfFiveHundredNotes);
        System.out.println("100Notes: " + noOfOneHundredNotes);

    }

}
