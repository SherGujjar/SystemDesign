package org.example;

public class InternalButton {

    InternalButtonDispatcher internalButtonDispatcher = new InternalButtonDispatcher();

    public void pressButton(int id,int floor, Direction dir){
        internalButtonDispatcher.submitRequest(id,floor,dir);
    }

}
