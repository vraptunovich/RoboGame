package com.robogame;

import java.util.ArrayList;
import java.util.HashMap;

public class MapRobot extends HashMap {
    Robot robot = null;
    ArrayList<String> robotsName = new ArrayList<String>();
    ListTask listTask;
  //  private Map<String, Robot> mapRobot = new HashMap<String, Robot>();
    Log log;

    public MapRobot(Log lg ) {
        this.log=lg;
        this.listTask = new ListTask(this.log);
    }
}
