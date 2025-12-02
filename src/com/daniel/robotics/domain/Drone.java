package com.daniel.robotics.domain;

import com.daniel.robotics.enums.RobotType;

public class Drone extends Robot implements Flyable, Combat {
    public Drone(String name, RobotType robotType) {
        super(name, robotType);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying");
    }

    @Override
    public void attack() {
    }
}