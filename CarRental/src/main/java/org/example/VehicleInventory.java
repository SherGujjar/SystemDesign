package org.example;

import org.example.Product.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleInventory {

    List<Vehicle> vehicleList = new ArrayList<>();

    //all crud operations

    public void addVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
    }

    public List<Vehicle> getAllVehicle(){
        return this.vehicleList;
    }



}
