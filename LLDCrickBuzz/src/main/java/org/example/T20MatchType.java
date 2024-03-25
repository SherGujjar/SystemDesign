package org.example;

public class T20MatchType implements MatchType{
    @Override
    public int totalOver() {
        return 20;
    }

    @Override
    public int overLimit() {
        return 4;
    }
}
