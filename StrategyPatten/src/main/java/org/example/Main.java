package org.example;

import org.example.driveStrategy.NormalDriveStrategy;
import org.example.driveStrategy.SpecialDriveStrategy;

public class Main {
    public static void main(String[] args) {
        Vehicle pv = new PassengerVehicle();
        pv.drive();

        Vehicle sv = new SportsVehicle();
        sv.drive();
    }
}