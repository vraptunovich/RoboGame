package com.robogame;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vova on 25.11.2015.
 */
public class ListTask {


    public static int TASK_LENGHT = 10;
    private List<Task> listTasks;
    private boolean autoAddListTask = false;
    private Log log ;

    public ListTask(Log lg) {
        this.log=lg;
        this.listTasks = new ArrayList<Task>(this.TASK_LENGHT);
        for (int i = 0; i < this.TASK_LENGHT; i++) addTask(new Task(lg));
        System.out.println("Создан список задач");

    }

    private void print(String s) {
        log.addLog(s);
    }


    public ListTask(Log log, boolean autoAddListTask) {
        this.log = log;
        this.autoAddListTask = autoAddListTask;
        this.listTasks = new ArrayList<Task>(this.TASK_LENGHT);
        for (int i = 0; i < this.TASK_LENGHT; i++) addTask(new Task(log));
        System.out.println("Создан список задач");

    }

    public ListTask(List<Task> tasks, boolean autoAddListTask, Log log) {
        this.listTasks = tasks;
        this.autoAddListTask = autoAddListTask;
        this.log = log;
    }

    public Task getTask() {
        Task tempTask;
        if (listTasks.size() > 0) {
            tempTask = listTasks.get(0);
            this.removeTask(0);
            return tempTask;
        } else return null;
    }

    public boolean isEmpty() {

        if (listTasks.isEmpty()) {
            return true;
        } else
            return false;

    }

    public void addTask(Task task) {
        if (this.listTasks.size() > this.TASK_LENGHT) {
           removeTask(0);

        }
        this.listTasks.add(task);
print("В listTask добавлена задача" + task.getName());

    }

    public void removeTask(int n) {
        if (this.listTasks.size() > 0) {
            this.listTasks.remove(n);
            print("Из listTask удалена задача" + listTasks.get(n).getName());
        }

        if (this.autoAddListTask == true) this.addTask(new Task());
    }

    public boolean isAutoAddListTask() {
        return autoAddListTask;
    }

    public void setAutoAddListTask(boolean autoAddListTask) {
        this.autoAddListTask = autoAddListTask;
    }
}
