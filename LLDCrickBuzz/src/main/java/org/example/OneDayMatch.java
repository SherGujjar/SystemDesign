package org.example;
public class OneDayMatch implements MatchType{

    @Override
    public int totalOver() {
        return 50;
    }

    @Override
    public int overLimit() {
        return 10;
    }
}
