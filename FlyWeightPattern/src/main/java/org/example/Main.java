package org.example;

public class Main {
    public static void main(String[] args) {
        Irobot humanoid = RobotFactory.createRobot("Humanoid");
        Irobot roboticDog = RobotFactory.createRobot("RoboticDog");
        Irobot humanoid1 = RobotFactory.createRobot("Humanoid");
        Irobot roboticDog2 = RobotFactory.createRobot("RoboticDog");
        humanoid.display(1,1);
        humanoid1.display(2,2);
        roboticDog.display(2,3);
        roboticDog2.display(4,8);

    }
}