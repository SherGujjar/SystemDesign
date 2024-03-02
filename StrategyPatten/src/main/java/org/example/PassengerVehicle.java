package org.example;

import org.example.driveStrategy.DriveStrategy;
import org.example.driveStrategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle{
    PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
