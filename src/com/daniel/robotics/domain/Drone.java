package com.daniel.robotics.domain;

import com.daniel.robotics.enums.RobotType;

public class Drone extends Robot implements Flyable, Combat {
    public Drone(String name, RobotType robotType) {
        super(name, robotType);
    }

    @Override
    public void attack() {
        consumeEnergy(getRobotType().getAttackCost());
        System.out.println(getName() + " attack consumed " + getRobotType().getAttackCost());
        System.out.println(getName() + "'s " + getBattery().toString());
    }

    @Override
    public void fly() {
        consumeEnergy(getRobotType().getFlyCost());
        System.out.println(getName() + " fly consumed " + getRobotType().getFlyCost());
        System.out.println(getName() + "'s " + getBattery().toString());
    }
}