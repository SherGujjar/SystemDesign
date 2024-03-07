package org.example;

import java.util.HashMap;
import java.util.Map;

public class Context {

    Map<String,Integer> contextMap = new HashMap<>();

    public void put(String strValue,int intValue){
        contextMap.put(strValue,intValue);
    }

    public int get(String strValue){
        return contextMap.get(strValue);
    }
}
