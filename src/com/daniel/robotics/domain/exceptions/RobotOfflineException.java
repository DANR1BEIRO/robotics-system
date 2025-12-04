package com.daniel.robotics.domain.exceptions;

public class RobotOfflineException extends RoboticException {
    public RobotOfflineException(String robotName) {
        super("[" + robotName + "] está offline e não pode executar esta ação.");
    }
}
