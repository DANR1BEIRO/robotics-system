package com.daniel.robotics.domain;

import com.daniel.robotics.enums.RobotType;

public class Mech extends Robot implements Combat {
    public Mech(String name, RobotType robotType) {
        super(name, robotType);
    }

    @Override
    public void attack() {
        consumeEnergy(getRobotType().getAttackCost());
        System.out.println(getName() + " attack consumed " + getRobotType().getAttackCost());
        System.out.println(getName() + "'s " + getBattery().toString());
    }
}
