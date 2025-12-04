package com.daniel.robotics.service;

import com.daniel.robotics.domain.Combat;

import com.daniel.robotics.domain.Flyable;
import com.daniel.robotics.domain.Robot;
import com.daniel.robotics.domain.Workable;
import com.daniel.robotics.exceptions.LowBatteryException;
import com.daniel.robotics.exceptions.RobotOfflineException;
import com.daniel.robotics.exceptions.SystemOverloadException;

public final class RobotService {

    public static <T extends Robot & Combat> void performAttack(T robot) {
        try {
            robot.attack();
        } catch (LowBatteryException e) {
            System.out.println(e.getMessage());
        } catch (RobotOfflineException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void performRecharge(Robot robot, int amount) {
        try {
            robot.rechargeBattery(amount);
        } catch (SystemOverloadException e) {
            System.out.println(e.getMessage());
        } catch (RobotOfflineException e) {
            System.out.println(e.getMessage());
        }
    }

    public static <T extends Robot & Workable> void performWork(T robot) {
        try {
            robot.work();
        } catch (SystemOverloadException e) {
            System.out.println(e.getMessage());
        } catch (RobotOfflineException e) {
            System.out.println(e.getMessage());
        }
    }

    public static <T extends Robot & Flyable> void performFly(T robot) {
        try {
            robot.fly();
        } catch (SystemOverloadException e) {
            System.out.println(e.getMessage());
        } catch (RobotOfflineException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void turnRobotOn(Robot robot) {
        robot.turnOn();
    }

    public static void turnRobotOff(Robot robot) {
        robot.turnOff();
    }
}
