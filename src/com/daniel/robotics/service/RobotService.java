package com.daniel.robotics.service;

import com.daniel.robotics.domain.Combat;

import com.daniel.robotics.domain.Robot;
import com.daniel.robotics.exceptions.LowBatteryException;

public final class RobotService {

    public static <T extends Robot & Combat> void performAttack(T robot) {
        try {
            robot.attack();
        } catch (LowBatteryException e) {
            System.out.println(robot.getName() + " não tem energia suficiente para atacar.\n" + e.getMessage());
        }
    }
}
