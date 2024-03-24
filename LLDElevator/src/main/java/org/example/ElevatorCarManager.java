package org.example;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class ElevatorCarManager {
    ElevatorCar elevatorCar;

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ElevatorCarManager(ElevatorCar elevatorCar){
        this.elevatorCar = elevatorCar;
        this.id = elevatorCar.getId();
    }

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b.compareTo(a));

    ArrayList<Integer> pendingReq = new ArrayList<>();

    public void addReq(int floor, Direction dir){
        if(dir==Direction.UP && elevatorCar.currentFloor<floor){
            minHeap.add(floor);
        }
        else if(dir==Direction.UP && elevatorCar.currentFloor>floor){
            pendingReq.add(floor);
        }
        else if(dir==Direction.Down && elevatorCar.currentFloor>floor){
            maxHeap.add(floor);
        }
        else{
            pendingReq.add(floor);
        }
    }

    public void commandToMove(){

    }

}
