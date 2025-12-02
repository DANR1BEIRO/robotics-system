package com.daniel.robotics.exceptions;

public class LowBatteryException extends RuntimeException {
  public LowBatteryException(String message) {
    super(message);
  }
}
