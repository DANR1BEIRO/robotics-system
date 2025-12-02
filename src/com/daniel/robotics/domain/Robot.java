package com.daniel.robotics.domain;

import com.daniel.robotics.enums.RobotType;

public abstract class Robot {
    private String name;
    private RobotType robotType;

    public Robot(String name, RobotType robotType) {
        this.name = name;
        this.robotType = robotType;
    }

    public String getName() {
        return name;
    }

    public RobotType getRobotType() {
        return robotType;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", robotType=" + robotType +
                '}';
    }
}
