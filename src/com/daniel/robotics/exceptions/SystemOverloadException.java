package com.daniel.robotics.exceptions;

public class SystemOverloadException extends RoboticException {

    public SystemOverloadException(String robotName) {
        super("[" + robotName + "] operação inválida: carga da bateria está no limite máximo.");
    }
}
