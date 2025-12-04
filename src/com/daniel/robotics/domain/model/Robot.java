package com.daniel.robotics.domain.model;

import com.daniel.robotics.enums.RobotType;

public abstract class Robot {
    private String name;
    private RobotType robotType;
    private Battery battery;
    private boolean isOnline;

    public Robot(String name, RobotType robotType) {
        this.name = name;
        this.robotType = robotType;
        this.battery = new Battery(robotType);
        this.isOnline = false;
    }

    protected void consumeEnergy(int amount) {
        battery.consume(getName(), amount);
    }


    public void rechargeBattery(int amount) {
        battery.recharge(getName(), amount);
        System.out.println("[" + name + "] bateria carregada: " + amount);
        System.out.println("[" + getName() + "] " + getBattery());
    }

    public void turnOn() {
        if (this.isOnline) {
            return;
        }
        this.isOnline = true;
        System.out.println("[" + name + "] ligado e pronto.");
    }

    public void turnOff() {
        if (!this.isOnline) {
            return;
        }
        this.isOnline = false;
        System.out.println("[" + name + "] deligado.");
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

    public boolean isOnline() {
        return isOnline;
    }
}
