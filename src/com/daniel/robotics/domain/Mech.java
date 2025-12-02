package com.daniel.robotics.domain;

import com.daniel.robotics.enums.RobotType;

public class Mech extends Robot implements Combat {
    public Mech(String name, RobotType robotType) {
        super(name, robotType);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " is attacking.");
    }
}
