package com.daniel.robotics.domain;

import com.daniel.robotics.enums.RobotType;

public class Android extends Robot implements Workable {
    public Android(String name, RobotType robotType) {
        super(name, robotType);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is working.");
    }
}
