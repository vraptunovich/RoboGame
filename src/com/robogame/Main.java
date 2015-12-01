package com.robogame;


import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");


        MapRobot robotMapRobot = new MapRobot();


        Iterator<Map.Entry<String, Robot>> iterator = robotMapRobot.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Robot> entry = iterator.next();
            entry.getValue().run();
        }


    }


}

