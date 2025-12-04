package com.daniel.robotics.domain;

import com.daniel.robotics.enums.RobotType;
import com.daniel.robotics.exceptions.RobotOfflineException;

public class Drone extends Robot implements Flyable, Combat {
    public Drone(String name, RobotType robotType) {
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

    @Override
    public void fly() {
        if (!isOnline()) {
            throw new RobotOfflineException(getName());
        }
        consumeEnergy(getRobotType().getFlyCost());
        System.out.println("[" + getName() + "]" + " voo consumiu " + getRobotType().getFlyCost());
        System.out.println("[" + getName() + "] " + getBattery());
    }
}