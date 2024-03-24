package org.example;

import java.util.List;

public class ExternalButtonDispatcher {

    List<ElevatorCarManager> elevatorCarManagers = Building.elevatorCarManagers;

    public void submitRequest(int floor, Direction dir) {
       elevatorCarManagers.get(0).addReq(floor,dir);
    }

}
