package org.example;

import java.util.List;

public class EvenLiftDispactcher extends ExternalButtonDispatcher {

    List<ElevatorCarManager> elevatorCarManagers = Building.elevatorCarManagers;

    public void submitRequest(int floor, Direction dir) {
        for(ElevatorCarManager elevatorCarManager : elevatorCarManagers){
            if(elevatorCarManager.getId()%2!=0){
                elevatorCarManager.addReq(floor,dir);
            }
        }
    }
}
