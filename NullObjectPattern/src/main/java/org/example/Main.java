package org.example;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = VehicleFactory.getVehicleObject("CAR");
        Vehicle v2 = VehicleFactory.getVehicleObject("Bike");
        System.out.println(v1.doors());
        System.out.println(v1.getTyres());
        System.out.println(v2.getTyres());
        System.out.println(v2.doors());
    }
}