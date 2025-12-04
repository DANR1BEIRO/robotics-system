package com.daniel.robotics.domain.model;

import com.daniel.robotics.domain.capability.Combat;
import com.daniel.robotics.enums.RobotType;
import com.daniel.robotics.domain.exceptions.RobotOfflineException;

public class Mech extends Robot implements Combat {
    public Mech(String name, RobotType robotType) {
        super(name, robotType);
    }

    @Override
    public void attack() {
        if (!isOnline()) {
            throw new RobotOfflineException(getName());
        }
        consumeEnergy(getRobotType().getAttackCost());
        System.out.println("[" + getName() + "]" + " ataque consumiu " + getRobotType().getAttackCost());
        System.out.println("[" + getName() + "] " + getBattery());
    }
}
