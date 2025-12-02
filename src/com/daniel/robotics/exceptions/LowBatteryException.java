package com.daniel.robotics.exceptions;

public class LowBatteryException extends RoboticException {
    public LowBatteryException(int currentBattery, int cost) {
        super("Carga atual: " + currentBattery + " | Necessário: " + cost);
    }
}
