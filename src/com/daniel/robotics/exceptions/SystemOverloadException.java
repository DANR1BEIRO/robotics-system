package com.daniel.robotics.exceptions;

public class SystemOverloadException extends RoboticException {

    public SystemOverloadException(String message, String name) {
        super(message + "A bateria de " + name + " já está totalmente carregada!");
    }
}
