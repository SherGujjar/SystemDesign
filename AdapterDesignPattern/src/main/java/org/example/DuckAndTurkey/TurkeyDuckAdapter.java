package org.example.DuckAndTurkey;

public class TurkeyDuckAdapter implements Duck{
    Turkey turkey;

    public TurkeyDuckAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gubles();
    }

    @Override
    public void fly() {
        for(int i=0;i<5;i++){
            turkey.fly();
        }
    }
}
