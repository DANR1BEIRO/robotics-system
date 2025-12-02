package com.daniel.robotics.domain;

import com.daniel.robotics.enums.RobotType;
import com.daniel.robotics.exceptions.LowBatteryException;

public class Battery {
    private int currentEnergy;
    private int maxCharge;


    public Battery(RobotType robotType) {
        this.maxCharge = robotType.getMaxBattery();
        this.currentEnergy = maxCharge;
    }

    public void consume(int amount) {
        if (amount > currentEnergy) {
            throw new LowBatteryException(currentEnergy, amount);
        }
        currentEnergy -= amount;
    }

    @Override
    public String toString() {
        return "current energy: " + currentEnergy + "/" + maxCharge;
    }

    public int getCurrentEnergy() {
        return currentEnergy;
    }

    public int getMaxCharge() {
        return maxCharge;
    }
}
