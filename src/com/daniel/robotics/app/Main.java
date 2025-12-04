package com.daniel.robotics.app;

import com.daniel.robotics.domain.*;
import com.daniel.robotics.enums.RobotType;
import com.daniel.robotics.service.RobotService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    }
}
