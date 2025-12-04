package com.daniel.robotics.domain.model;

import com.daniel.robotics.domain.capability.Workable;
import com.daniel.robotics.enums.RobotType;
import com.daniel.robotics.domain.exceptions.RobotOfflineException;

public class Android extends Robot implements Workable {
    public Android(String name, RobotType robotType) {
        super(name, robotType);
    }

    @Override
    public void work() {
        if (!isOnline()) {
            throw new RobotOfflineException(getName());
        }
        int cost = getRobotType().getWorkCost();
        consumeEnergy(cost);
        System.out.println("[" + getName() + "]" + " trabalho consumiu " + getRobotType().getWorkCost());
        System.out.println("[" + getName() + "] " + getBattery());
    }
}
