package com.robogame;


import java.util.*;

public class MapRobot extends HashMap {
    private Map<String, Robot> mapRobot = new HashMap<String, Robot>();
    private static int workingRobots = 3;
    Robot robot = null;
    ArrayList<String> robotsName = new ArrayList<String>();
    ListTask listTask = new ListTask();

    public MapRobot(Map<String, Robot> mapRobot) {
        this.mapRobot = mapRobot;
        for (Map.Entry<String, Robot> e : mapRobot.entrySet()) {
            robotsName.add(e.getKey());
        }
    }

    public MapRobot() {
        for (int i = 0; i < this.workingRobots; i++) {
            if (robot == null) robot = new Robot(listTask);
            mapRobot.put(robot.getName(), robot);
            robotsName.add(robot.getName());
            robot = null;
        }
    }

    public Robot getFirstRobot() {
        return mapRobot.get(robotsName.get(0));
    }


}
