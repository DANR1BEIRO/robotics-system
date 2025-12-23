package com.daniel.robotics.app;

import com.daniel.robotics.domain.model.*;
import com.daniel.robotics.enums.RobotType;
import com.daniel.robotics.service.RobotService;

import java.util.DoubleSummaryStatistics;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Mech megaman = new Mech("Megaman", RobotType.COMBAT);
        Android ns5 = new Android("NS-5", RobotType.ANDROID);
        Drone eva = new Drone("EVA", RobotType.DRONE);

        Set<Robot> robotList = new HashSet<>(List.of(megaman, ns5, eva));

        for (Robot robot : robotList) {
            RobotService.turnRobotOn(robot);
            if (robot instanceof Android workable) {
                RobotService.performWork(workable);
            }

            if (robot instanceof Mech combat) {
                RobotService.performAttack(combat);
            }

            if (robot instanceof Drone drone) {
                RobotService.performFly(drone);
                RobotService.performAttack(drone);
            }

            RobotService.performRecharge(robot, 5);
            System.out.println("--------------------------------");
        }

        String robotListStream = robotList.stream()
                .map(Robot::getName)
                .collect(Collectors.joining(", ", "", "."));
        System.out.println(robotListStream);

        DoubleSummaryStatistics batteryStats = robotList.stream()
                .map(Robot::getBattery)
                .collect(Collectors.summarizingDouble(Battery::getCurrentEnergy));
        System.out.println(batteryStats);

        String robotType = robotList.stream()
                .map(Robot::getRobotType)
                .map(RobotType::name)
                .collect(Collectors.joining(", ", "", "."));
        System.out.println(robotType);
    }
}
