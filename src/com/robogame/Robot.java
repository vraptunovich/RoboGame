package com.robogame;

import java.util.List;

public class Robot extends Thread  {
    private String name;
    private static int number = 1;
    private Task task = null;
    private ListTask taskList;
    private Boolean work = false;

    private void setTaskList(ListTask taskList) {
        this.taskList = taskList;
    }

    public Robot(ListTask listTask) {

        this.name = Integer.toString(number);
        System.out.println("...Создан робот с номером " + Integer.toString(number) + "...");
        number++;
        setTaskList(listTask);
         this.start();
    }

    public void setTaskForRobot(Task taskForRobot) {
        if (this.task == null)
            this.task = taskForRobot;
    }

    public String getNameRobot() {
        return name;
    }


    public static int getNumber() {
        return number;
    }

    public void getTaskFor() {
        task = taskList.getTask();
    }

    private void deleteTask() {
        this.task = null;
        work = false;
    }

    private void runTask() {
        if (task != null && work == false) {
            task.runTask();
            work = true;
        }
        deleteTask();
    }


    @Override
    public void run() {

        runTask();
    }
}
