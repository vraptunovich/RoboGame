package com.robogame;

import config.Config;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vova on 25.11.2015.
 */
public class ListTask {

    private List<Task> tasks;

    public List<Task> getTask() {
        return tasks;
    }

    public ListTask() {
        this.tasks = new ArrayList<Task>(Config.TASK_LENGHT);
        for (int i=0; i<Config.TASK_LENGHT;i++) addTask(new Task());

    }

    public void addTask(Task task) {
        if (this.tasks.size() > Config.TASK_LENGHT) this.tasks.remove(0);
        this.tasks.add(task);
    }

    public void removeTask ()
    {
        if (this.tasks.size()>0)
        this.tasks.remove(0);
        this.addTask(new Task());
            }

}
