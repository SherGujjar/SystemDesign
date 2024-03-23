package org.example;

public class MachineInKg implements WeightMachineApapter{

    WeightMachine weightMachine;
    public MachineInKg(WeightMachine weightMachine){
        this.weightMachine = weightMachine;
    }


    @Override
    public double getWeightInKg() {
        return weightMachine.measuredWeight()*4.5;
    }
}
