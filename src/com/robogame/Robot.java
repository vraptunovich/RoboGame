package com.robogame;


import java.util.List;

public class Robot {
    public String name;
    private static int number = 1;
    Task task = new Task();
    List<Task> taskList;

    public Robot() {
        number++;
        this.name = Integer.toString(number);
        System.out.println("...Создан робот с номером " + Integer.toString(number) + "...");
    }

    public void getTask() {


    }


}
