package com.daniel.robotics.app;

import com.daniel.robotics.domain.Mech;
import com.daniel.robotics.enums.RobotType;
import com.daniel.robotics.service.RobotService;

public class Main {
    public static void main(String[] args) {
        Mech megaman = new Mech("Megaman", RobotType.COMBAT);

        RobotService.performRecharge(megaman, 200);

        RobotService.performAttack(megaman);
        RobotService.performAttack(megaman);

        RobotService.performRecharge(megaman, 10);
        RobotService.performRecharge(megaman, 40);


    }
}
