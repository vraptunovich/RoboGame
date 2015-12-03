package com.robogame;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vova on 25.11.2015.
 */
public class ListTask extends ArrayList {


    private int TASK_LENGHT = 3;
    // private List<Task> listTasks = new ArrayList<Task>(this.TASK_LENGHT);
    private boolean autoAddListTask = false;
    private Log log;

    public ListTask(Log lg) {
        this.log = lg;
        // for (int i = 0; i < this.TASK_LENGHT; i++) addTask(new Task(lg));
        // System.out.println("Создан список задач");

    }

    public ListTask(Log log, boolean autoAddListTask) {
        this.log = log;
        this.autoAddListTask = autoAddListTask;
        //   this.listTasks = new ArrayList<Task>(this.TASK_LENGHT);
        //  for (int i = 0; i < this.TASK_LENGHT; i++) addTask(new Task(log));
        //  System.out.println("Создан список задач");

    }

    public ListTask(List<Task> tasks, boolean autoAddListTask, Log log) {
        this.autoAddListTask = autoAddListTask;
        this.log = log;
    }

    public int getTASK_LENGHT() {
        return TASK_LENGHT;
    }

    public void setTASK_LENGHT(int TASK_LENGHT) {
        this.TASK_LENGHT = TASK_LENGHT;
    }

    private void print(String s) {
        log.addLog(s);
    }

    @Override
    public boolean add(Object o) {
        if (this.size() > this.TASK_LENGHT) {
            this.remove(0);
        }
        boolean flag = super.add(o);
        Task tempTask = (Task) o;
        print("В listTask добавлена задача" + tempTask.getName());
        return flag;
    }

    @Override
    public Object remove(int index) {
        Object o = null;
        if (!this.isEmpty()) {

            Task tempTask = (Task) this.get(index);
            print("Из listTask удалена задача" + tempTask.getName());
            o = super.remove(index);
        }
        if (this.autoAddListTask == true) this.add(new Task());

        return o;
    }

    public boolean isAutoAddListTask() {
        return autoAddListTask;
    }

    public void setAutoAddListTask(boolean autoAddListTask) {
        this.autoAddListTask = autoAddListTask;
    }
}
