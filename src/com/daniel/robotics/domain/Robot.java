package com.daniel.robotics.domain;

import com.daniel.robotics.enums.RobotType;

public abstract class Robot {
    private String name;
    private RobotType robotType;
    private Battery battery;

    public Robot(String name, RobotType robotType) {
        this.name = name;
        this.robotType = robotType;
        this.battery = new Battery(robotType);

    }

    protected void consumeEnergy(int amount) {
        battery.consume(amount);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", robotType=" + robotType +
                ", battery=" + battery +
                '}';
    }

    public String getName() {
        return name;
    }

    public RobotType getRobotType() {
        return robotType;
    }

    public Battery getBattery() {
        return battery;
    }
}
