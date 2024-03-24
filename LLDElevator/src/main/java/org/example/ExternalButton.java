package org.example;

import java.util.List;

public class ExternalButton {

    ExternalButtonDispatcher externalButtonDispatcher;

    ExternalButton(ExternalButtonDispatcher externalButtonDispatcher){
        this.externalButtonDispatcher = externalButtonDispatcher;
    }

    public void pressButton(int floor, Direction dir){
        externalButtonDispatcher.submitRequest(floor,dir);
    }

}
