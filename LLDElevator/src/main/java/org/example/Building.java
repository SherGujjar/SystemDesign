package org.example;

import java.util.ArrayList;
import java.util.List;

public class Building {

    public static int floorId = 1;

    public static List<ElevatorCarManager> elevatorCarManagers = new ArrayList<>();

    public List<Floor> floors;


    public List<ElevatorCar> elevatorCars;

    public void addFloor(){
        Floor floor = new Floor(floorId++);
        floors.add(floor);
    }

    public void addElevator(ElevatorCar elevatorCar){
        elevatorCarManagers.add(new ElevatorCarManager(elevatorCar));
        elevatorCars.add(elevatorCar);
    }

}
