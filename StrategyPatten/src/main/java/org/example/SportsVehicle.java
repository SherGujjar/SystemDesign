package org.example;

import org.example.driveStrategy.DriveStrategy;
import org.example.driveStrategy.SpecialDriveStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {
        super(new SpecialDriveStrategy());
    }
}
