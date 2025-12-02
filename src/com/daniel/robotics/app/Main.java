package com.daniel.robotics.app;

import com.daniel.robotics.domain.Mech;
import com.daniel.robotics.enums.RobotType;
import com.daniel.robotics.service.RobotService;

public class Main {
    public static void main(String[] args) {
        Mech megaman = new Mech("Megaman", RobotType.COMBAT);

        RobotService.performAttack(megaman);
        RobotService.performAttack(megaman);
    }
}
