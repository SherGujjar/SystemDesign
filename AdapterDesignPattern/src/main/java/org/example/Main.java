package org.example;

import org.example.DuckAndTurkey.*;
import org.example.IteratorAndEnumeration.EnemurationIteratorAdapter;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Duck d1 = new MolardDuck();
//        Duck d2 = new RubberDuck();
//        Duck d3 = new TurkeyDuckAdapter(new Yelp());
//        d1.fly();
//        d2.fly();
//        d3.fly();


        Vector<Integer> vec = new Vector<>(5);
        for(int i=0;i<5;i++){
            vec.add(i,i);
        }

        Enumeration<Integer> elements = vec.elements();
        Iterator iterator = new EnemurationIteratorAdapter(elements);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}