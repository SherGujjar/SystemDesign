package org.example;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    public static Map<String,Irobot> robotCache = new HashMap<>();

    public static Irobot createRobot(String type){
        if(robotCache.containsKey(type)){
            return robotCache.get(type);
        }else{
            if(type.equalsIgnoreCase("Humanoid")){
                Irobot humanoidRobot = new Humanoids(type,new Spirit());
                robotCache.put(type,humanoidRobot);
                return humanoidRobot;
            }
            else{
                Irobot roboticDog = new RoboticDog(type,new Spirit());
                robotCache.put(type,roboticDog);
                return roboticDog;
            }
        }
    }
}
