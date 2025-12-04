package com.daniel.robotics.exceptions;

public class LowBatteryException extends RoboticException {
    public LowBatteryException(String robotName, int currentBattery, int cost) {
        super("[" + robotName + "] energia insuficiente para executar a ação. " +
                "Detalhes: atual = " + currentBattery + ", necessário = " + cost + ".");
    }
}
