package com.daniel.robotics.app;

import com.daniel.robotics.domain.Android;
import com.daniel.robotics.domain.Drone;
import com.daniel.robotics.domain.Mech;
import com.daniel.robotics.enums.RobotType;
import com.daniel.robotics.service.RobotService;

public class Main {
    public static void main(String[] args) {
        Mech megaman = new Mech("Megaman", RobotType.COMBAT);
        Android ns5 = new Android("NS-5", RobotType.ANDROID);
        Drone eva = new Drone("EVA", RobotType.DRONE);

        RobotService.performRecharge(megaman, 200);
        RobotService.performRecharge(eva, 10);
        RobotService.performRecharge(ns5, 2);

        RobotService.performAttack(megaman);
        RobotService.performRecharge(megaman, 5);

        RobotService.performAttack(eva);
        RobotService.performRecharge(eva, 10);

        RobotService.performWork(ns5);
        RobotService.performRecharge(ns5, 2);


    }
}
