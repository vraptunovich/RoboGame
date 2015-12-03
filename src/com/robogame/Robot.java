package com.robogame;

public class Robot extends Thread {
    private static int numNameRobot = 0;
    private Task task = null;
    private ListTask taskList;
    private boolean finishTask ;
    private boolean workingNow = false;
    private boolean autoGetTask = true;
    private boolean pause = false;
    private String name;
    private Log log = null;

    public Robot(boolean autoGetTask, Log log, String name, ListTask taskList) {
        this.autoGetTask = autoGetTask;
        this.log = log;
        this.name = "Робот №" + Integer.toString(this.numNameRobot);
        this.numNameRobot++;
        this.taskList = taskList;
        print("Создан " + this.name);
    }

    @Override
    public synchronized void run() {
        setTask();
        this.workingNow = true;
        while (this.workingNow) {
            task.runTask();

            if (this.autoGetTask) {
                workingNow = setTask();
            } else {
                this.workingNow = false;
                delteTask();
            }
        }


    }

public void BreakeRobot ()
{
    this.interrupt();

}



    public boolean setTask() {

        if (!taskList.isEmpty()) {

            task = (Task) taskList.get(0);
            if (task == null) {
                print(this.name + " не получил задание ");
                return false;
            } else {
                print(this.name + " получил задание " + task.getName());
                this.pause = false;

                return true;
            }
        } else {
            print("Список заданий пуст.");
            return false;
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

        return this.task;

    }

    public boolean isWorkingNow() {
        return workingNow;
    }

    public void setWorkingNow(boolean workingNow) {
        this.workingNow = workingNow;
    }


}
