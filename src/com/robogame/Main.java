package com.robogame;


public class Main {

    public static void main(String[] args) {

        Log log = new Log();
        RoboTask roboTask = new RoboTask(log);

        roboTask.createTaskList(roboTask.listTask.getTASK_LENGHT());
        roboTask.createRoboMap(roboTask.listTask.getTASK_LENGHT());
        //roboTask.startAllRobots();

        try {
            roboTask.mapRobot.get("Робот №0").run();
            Thread.sleep(5000);
            roboTask.mapRobot.get("Робот №0").interrupt();
           // Thread.sleep(5000);
           // roboTask.mapRobot.get("Робот №0").resume();


        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //  int i = 0;
        // ArrayList<String> tempKeys = new ArrayList<>();
        //  ArrayList<Robot> tempValues = new ArrayList<>();


        //  for (Map.Entry<String, Robot> entry : roboTask.mapRobot.entrySet()) {
        //       tempKeys.add(entry.getKey());
        //       tempValues.add(entry.getValue());
        //   }

        //    roboTask.mapRobot.get(tempKeys.get(0)).start();

    }
}
