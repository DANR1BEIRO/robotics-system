package com.daniel.robotics.enums;

public enum RobotType {
    DRONE(100, 20, 5, 0),
    COMBAT(200, 20, 0, 0),
    ANDROID(70, 0, 0, 5);

    private int maxBattery;
    private int attackCost;
    private int flyCost;
    private int workCost;

    RobotType(int maxBattery, int attackCost, int flyCost, int workCost) {
        this.maxBattery = maxBattery;
        this.attackCost = attackCost;
        this.flyCost = flyCost;
        this.workCost = workCost;
    }

    public int getMaxBattery() {
        return maxBattery;
    }

    public int getAttackCost() {
        return attackCost;
    }

    public int getFlyCost() {
        return flyCost;
    }

    public int getWorkCost() {
        return workCost;
    }
}




