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
        this.listTask = new ListTask(log);

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
            if (i > listTask.getTASK_LENGHT() -1) {
                break;
            }
            listTask.add(task[i]);
        }
    }

    public void createTaskList(int n) {
        for (int i = 0; i < n; i++) {
            if (i > listTask.getTASK_LENGHT()-1) {
                break;
            }
            Task task = new Task(log);

            listTask.add(task);
            task = null;
        }
    }

    public void createTaskList(int n, boolean working, int name, int speed) {
        ListTask ltask = new ListTask(this.log);
        for (int i = 0; i < n; i++) {
            if (i > listTask.getTASK_LENGHT()-1) {
                break;
            }
            Task task = new Task(log, working, name, speed);

            ltask.add(task);
            task = null;
        }
        this.listTask = ltask;
    }

    public void createRoboMap(int n) {
        for (int i = 0; i < n; i++) {
            Robot robot = new Robot(true, this.log, Integer.toString(n), this.listTask);

            mapRobot.put(robot.getNameRobot(), robot);
            robot = null;
        }
    }

    public void startAllRobots ()
    {

        int i=0;
        ArrayList<String> tempKeys = new ArrayList<>();
        ArrayList<Robot> tempValues = new ArrayList<>();

        for (Map.Entry<String, Robot> entry : this.mapRobot.entrySet()) {

            tempKeys.add(entry.getKey());
            tempValues.add(entry.getValue());
            tempValues.get(i).start();
            i++;
        }

    }


}
