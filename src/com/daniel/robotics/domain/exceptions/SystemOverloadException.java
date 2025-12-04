package com.daniel.robotics.domain.exceptions;

public class SystemOverloadException extends RoboticException {

    public SystemOverloadException(String robotName) {
        super("[" + robotName + "] operação inválida: carga da bateria está no limite máximo.");
    }
}
