package com.robogame;

public class Robot extends Thread {
    private Task task = null;
    private ListTask taskList;
    private boolean finishTask = true;
    private boolean workingNow = false;
    private boolean autoGetTask = false;
    private boolean pause = false;
    private String name;
    private Log log = null;
private static int numNameRobot=0;

    public Robot(boolean autoGetTask, Log log, String name, ListTask taskList) {
        this.autoGetTask = autoGetTask;
        this.log = log;
        this.name = "Робот №"+Integer.toString(this.numNameRobot);
        this.numNameRobot++;
        this.taskList = taskList;
    }

    @Override
    public void run() {

        while (autoGetTask == false || !taskList.isEmpty()) {
            if (setTask()) {
                task.runTask();
                delteTask();
            }
        }
    }


    public boolean setTask() {

        task = taskList.getTask();
        if (task == null) {
            return false;
        } else {
            return true;
        }

    }


    public void delteTask() {
        this.task = null;
    }

    public Log getLog() {
        return log;
    }

    private void print(String s) {
        log.addLog(s);
    }

    public boolean isAutoGetTask() {
        return autoGetTask;
    }

    public void setAutoGetTask(boolean autoGetTask) {
        this.autoGetTask = autoGetTask;
    }

    public boolean isFinishTask() {
        return finishTask;
    }

    public void setFinishTask(boolean finishTask) {
        this.finishTask = finishTask;
    }

    public String getNameRobot() {
        return name;
    }

    public void setNameRobot(String name) {
        this.name = name;
    }

    public boolean isPause() {
        return pause;
    }

    public void setPause(boolean pause) {
        this.pause = pause;
    }

    public Task getTask() {
        return task;
    }

    public boolean isWorkingNow() {
        return workingNow;
    }

    public void setWorkingNow(boolean workingNow) {
        this.workingNow = workingNow;
    }


}
