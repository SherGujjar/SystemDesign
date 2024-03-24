package org.example;

import java.util.List;

public class OddLiftDispatcher extends ExternalButtonDispatcher{

    List<ElevatorCarManager> elevatorCarManagers = Building.elevatorCarManagers;

    @Override
    public void submitRequest(int floor, Direction dir) {
        for(ElevatorCarManager elevatorCarManager : elevatorCarManagers){
            if(elevatorCarManager.getId()%2!=0){
                elevatorCarManager.addReq(floor,dir);
            }
        }
    }
}
