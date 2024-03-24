package org.example;

import java.util.List;

public class Floor {

    int floorId;

    ExternalButtonDispatcher externalButtonDispatcher;

    public Floor(int id){
        this.floorId = id;
        externalButtonDispatcher = new ExternalButtonDispatcher();
    }

    public void pressButton(Direction direction){
        externalButtonDispatcher.submitRequest(floorId,direction);
    }

}
