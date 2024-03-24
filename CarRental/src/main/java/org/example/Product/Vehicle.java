package org.example.Product;

public class Vehicle {
    private String vehicleNumber;
    private VehicleType vehicleType;

    private int kmTraveled;

    private Status status;

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getKmTraveled() {
        return kmTraveled;
    }

    public void setKmTraveled(int kmTraveled) {
        this.kmTraveled = kmTraveled;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
