package org.example;

public class ElevatorCar {

    private int id;

    private Display display;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private InternalButton internalButton;
    private Status status;

    int currentFloor;

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public InternalButton getInternalButton() {
        return internalButton;
    }

    public void setInternalButton(InternalButton internalButton) {
        this.internalButton = internalButton;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void move(int floor){
        System.out.println("Moving to the floor "+floor);
    }
}
