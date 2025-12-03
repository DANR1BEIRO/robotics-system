package com.daniel.robotics.domain;

import com.daniel.robotics.enums.RobotType;

public class Android extends Robot implements Workable {
    public Android(String name, RobotType robotType) {
        super(name, robotType);
    }

    @Override
    public void work() {
        int cost = getRobotType().getWorkCost();
        consumeEnergy(cost);

        System.out.println(getName() + " work consume " + cost);
        System.out.println(getName() + "'s " + getBattery());
    }
}
