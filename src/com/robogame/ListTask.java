package com.robogame;

import config.Config;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vova on 25.11.2015.
 */
public class ListTask {

    private boolean autoAddTask = true;
    private List<Task> tasks;
    private static int TASK_LENGHT = 10;

    public Task getTask() {
        Task tempTask;
        if (tasks.size() > 0) {
            tempTask = tasks.get(0);
            this.removeTask();
            return tempTask;
        } else return null;
    }

    public ListTask() {
        this.tasks = new ArrayList<Task>(this.TASK_LENGHT);
        for (int i = 0; i < this.TASK_LENGHT; i++) addTask(new Task());

    }

    public void addTask(Task task) {
        if (this.tasks.size() > this.TASK_LENGHT) this.tasks.remove(0);
        this.tasks.add(task);
    }

    public void removeTask() {
        if (this.tasks.size() > 0)
            this.tasks.remove(0);

        if (this.autoAddTask == true) this.addTask(new Task());
    }

    public void setAutoAddTask(boolean autoAddTask) {
        this.autoAddTask = autoAddTask;
    }
}
