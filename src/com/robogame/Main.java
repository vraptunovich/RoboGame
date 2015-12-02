package com.robogame;


public class Main {

    public static void main(String[] args) {

        Log log = new Log();
        RoboTask roboTask = new RoboTask(log);

        roboTask.createTaskList(5);
        roboTask.createRoboMap(3);

    roboTask.listTask.add(new Task(log));
        Task tempTask= (Task)roboTask.listTask.get(0) ;
        tempTask.runTask();

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
