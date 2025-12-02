package com.daniel.robotics.domain;

import com.daniel.robotics.enums.RobotType;

public abstract class Battery {
    private int currentEnergy;
    private int maxCharge;


    public Battery(RobotType robotType) {
        this.maxCharge = robotType.getMaxBattery();
        this.currentEnergy = maxCharge;
    }

    public int getCurrentEnergy() {
        return currentEnergy;
    }

    public int getMaxCharge() {
        return maxCharge;
    }
}
