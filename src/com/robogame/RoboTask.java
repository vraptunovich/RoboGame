package com.robogame;

import java.util.ArrayList;

/**
 * Created by raptunovich_vk on 02.12.2015.
 */
public class RoboTask {
    MapRobot mapRobot ;
    Log log;
    ListTask listTask;
    Robot robot;
    Task task;
    ArrayList<String> robotsName;

    public RoboTask(Log log, int amountRobots) {
        this.log = log;
        this.mapRobot= new MapRobot(this.log);
        createTaskList();

        for (int i = 0; i < amountRobots; i++) {
            addRobotToMap(true, "");
        }
    }

    private void createTaskList() {
        listTask = new ListTask(log, true);
        for (int i = 0; i < ListTask.TASK_LENGHT; i++) {
            listTask.addTask(new Task(log));
        }
    }

    public void addTask(Boolean working, int name, int speed) {
        listTask.addTask(new Task(this.log, working, name, speed));
    }

    public void addRobotToMap(boolean auto, String name) {
        mapRobot.put(name, new Robot(auto, this.log, name, this.listTask));
    }

    public void StartAllRobots() {

        this.robotsName = mapRobot.robotsName;

        for (int i = 0; i < robotsName.size(); i++) {
            robot = (Robot) mapRobot.get(robotsName.get(i));
            robot.run();

        }


    }

}
