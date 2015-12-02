package com.robogame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class RoboTask {
    Map<String, Robot> mapRobot = new HashMap<>();
    Log log;
    ListTask listTask;

    ArrayList<String> robotsName;

    public RoboTask(Log log) {
        this.log = log;
        this.listTask=new ListTask(log);

    }

    public RoboTask(ListTask listTask, Log log) {
        this.listTask = listTask;
        this.log = log;
    }

    public RoboTask(ListTask listTask, Log log, Map<String, Robot> mapRobot) {
        this.listTask = listTask;
        this.log = log;
        this.mapRobot = mapRobot;
    }

    public void createTasklist(Task[] task) {
        for (int i = 0; i < task.length; i++) {
            listTask.addTask(task[i]);
        }
    }

    public void createTaskList(int n) {
        for (int i = 0; i < n; i++) {
            Task task = new Task(log);
        }
    }

    public void createTaskList(int n, boolean working, int name, int speed) {
        for (int i = 0; i < n; i++) {
            Task task = new Task(log, working, name, speed);
        }
    }

    public void createRoboMap(int n) {
        for (int i = 0; i < n; i++) {
            Robot robot = new Robot(false, this.log, Integer.toString(n), this.listTask);

            mapRobot.put(robot.getNameRobot(), robot);
            robot = null;
        }
    }



}
