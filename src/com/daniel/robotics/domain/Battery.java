package com.daniel.robotics.domain;

import com.daniel.robotics.enums.RobotType;
import com.daniel.robotics.exceptions.LowBatteryException;
import com.daniel.robotics.exceptions.SystemOverloadException;

public class Battery {
    private int currentEnergy;
    private int maxCharge;


    public Battery(RobotType robotType) {
        this.maxCharge = robotType.getMaxBattery();
        this.currentEnergy = maxCharge;
    }

    public void consume(String robotName, int amount) {
        if (amount > currentEnergy) {
            throw new LowBatteryException(robotName, currentEnergy, amount);
        }
        currentEnergy -= amount;
    }


    public void recharge(String robotName, int amount) {
        if (currentEnergy == maxCharge) {
            throw new SystemOverloadException(robotName);
        }
        if (currentEnergy + amount < maxCharge) {
            currentEnergy += amount;
        } else {
            currentEnergy = maxCharge;
        }
    }

    @Override
    public String toString() {
        return "Energia atual: " + currentEnergy + "/" + maxCharge;
    }

    public int getCurrentEnergy() {
        return currentEnergy;
    }

    public int getMaxCharge() {
        return maxCharge;
    }
}
