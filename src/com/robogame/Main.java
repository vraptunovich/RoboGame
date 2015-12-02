package com.robogame;


public class Main {

    public static void main(String[] args) {

        Log log = new Log();
        RoboTask roboTask = new RoboTask(log, 3);
        roboTask.StartAllRobots();

    }


}

