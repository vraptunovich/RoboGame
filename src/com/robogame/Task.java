package com.robogame;

import java.util.Random;

public class Task {
    private static int amountTasks = 3;
    private Log log;
    private String name = "-";
    private int numberName;
    private Boolean workingNow = false;
    private int timeSpeed = 3000;

    public Task(Log log ) {
        this.log = log;
        this.workingNow = false;

        Random rnd = new Random(System.currentTimeMillis());
        numberName = 1 + rnd.nextInt(amountTasks);
        name = Integer.toString(numberName);
        print("Создана задача:" + returnNameTask(numberName));
    }

    public Task(Log log, Boolean workingNow, int nName) {
        this.log = log;
        this.workingNow = workingNow;

        Random rnd = new Random(System.currentTimeMillis());
        this.numberName = nName;
        name = Integer.toString(numberName);
        print("Создана задача:" + returnNameTask(numberName));
    }

    public Task(Log log, Boolean workingNow, int nName, int tSpeed) {
        this.log = log;
        this.workingNow = workingNow;

        Random rnd = new Random(System.currentTimeMillis());
        this.numberName = nName;
        name = Integer.toString(numberName);

        this.timeSpeed = tSpeed;

        print("Создана задача:" + returnNameTask(numberName));
    }

    public Task() {
        this.log = null;
        this.workingNow = true;
        Random rnd = new Random(System.currentTimeMillis());
        this.numberName = 1 + rnd.nextInt(amountTasks);
        this.name = Integer.toString(this.numberName);

        print("Создана задача:" + returnNameTask(numberName));

    }

    public void runTask() {
        switch (numberName) {
            case 1:
                task1();
                break;
            case 2:
                task2();
                break;
            case 3:
                task3();
                break;
        }
    }

    private void print(String s) {
        log.addLog(s);
    }
    //setter and getters===================================================================

    public Log getLog() {
        return log;
    }

   private String returnNameTask(int n) {
        String s = "";
        switch (n) {
            case 1:
                s = "вычисления факториала числа";
                break;
            case 2:
                s = "чтение стихотворения";
                break;
            case 3:
                s = "имитация взрыва (обратный отсчет)";
                break;
            default:
                s = " - ";
        }
        return s;
    }

    public void setTimeSpeed(int timeSpeed) {
        this.timeSpeed = timeSpeed;
    }

    public void setLog(Log log) {
        this.log = log;
    }

    public String getName() {
        return name;
    }

    public void setWorkingNow(Boolean workingNow) {
        this.workingNow = workingNow;
    }

    public Boolean istWorkingNow() {
        return workingNow;
    }

    public void setTaskNumber(int numberName) {
        this.numberName = numberName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTaskNumber() {
        return numberName;
    }
    //========================================================


    private void task1() {

        Random rnd = new Random(System.currentTimeMillis());

        int n = 2 + rnd.nextInt(13 - 2 + 1);
        // System.out.println("Задача вычисления факторила числа " + Integer.toString(n));
        print("Запущена задача: " + returnNameTask(this.numberName) + " для числа" + Integer.toString(n));
        workingNow = true;
        try {
            Thread.sleep(timeSpeed + 2000);
            do {
                int result = 1;
                for (int i = 2; i <= n; i++) {
                    result *= i;
                    print("(задача вычисления факториала)Промежуточный результат :" + result + "...");
                    //System.out.println(result + "...вычисляю...");
                    Thread.sleep(timeSpeed + 2000);
                }
                // System.out.print("Факторил числа " + n + " равен:");
                // System.out.println(result);
                print("(задача вычисления факториала)Факторил числа " + n + " равен:" + result);
                if (n == 0 || n == 1) {
                    print("(задача вычисления факториала)Факторил числа " + n + " равен:" + result);
                    System.out.println(result);
                }
            } while (n < 0);

        } catch (InterruptedException e) {
            e.printStackTrace();

        } finally {
            workingNow = false;
            print("Задача : " + returnNameTask(this.numberName) + " для числа" + Integer.toString(n) + " завершилась");
        }
    }

    private void task2() {
        // System.out.println("Сейчас я буду читать вам стихотворение... ");
        print("Запущена задача: " + returnNameTask(this.numberName));
        workingNow = true;
        try {
            Thread.sleep(timeSpeed);

            print("У лукоморья дуб зелёный... (задача: чтение стихотворения)");

            Thread.sleep(timeSpeed);
            print("Златая цепь на дубе том:... (задача: чтение стихотворения)");
            Thread.sleep(timeSpeed);
            print("И днём и ночью кот учёный... (задача: чтение стихотворения)");
            Thread.sleep(timeSpeed);
            print("Всё ходит по цепи кругом;... (задача: чтение стихотворения)");
            Thread.sleep(timeSpeed);
            print("Идёт направо - песнь заводит,... (задача: чтение стихотворения)");
            Thread.sleep(timeSpeed);
            print("Налево - сказку говорит.... (задача: чтение стихотворения)");
            Thread.sleep(timeSpeed);
            print("Там чудеса: там леший бродит,... (задача: чтение стихотворения)");
            Thread.sleep(timeSpeed);
            print("Русалка на ветвях сидит;... (задача: чтение стихотворения)");
            Thread.sleep(timeSpeed);
            print("Там на неведомых дорожках... (задача: чтение стихотворения)");
            Thread.sleep(timeSpeed);
            print("Следы невиданных зверей;... (задача: чтение стихотворения)");
            Thread.sleep(timeSpeed);
            print("Избушка там на курьих ножках... (задача: чтение стихотворения)");
            Thread.sleep(timeSpeed);
            print("Стоит без окон, без дверей; ... (задача: чтение стихотворения)");
            Thread.sleep(timeSpeed);


        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            workingNow = false;
            print("Задача : " + returnNameTask(this.numberName) + " завершилась");
        }
    }

    private void task3() {
        //System.out.println("Всем оставаться на местах, иначе я взорву себя... ");
        print("Запущена задача: " + returnNameTask(this.numberName));
        workingNow = true;
        try {
            Thread.sleep(timeSpeed + 1000);
            Random rnd = new Random(System.currentTimeMillis());
// Получаем случайное число в диапазоне от min до max (включительно)
            int n = 20 + rnd.nextInt(30);
            System.out.println("обратный отсчет... ");
            print(n + "..." + "  задача: имитация взрыва(обратный отсчет)");
            Thread.sleep(timeSpeed + 1000);
            while (n != 0) {
                print(n + "..." + "  задача: имитация взрыва(обратный отсчет)");
                Thread.sleep(timeSpeed + 1000);
                n--;
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            workingNow = false;
            print("Задача : " + returnNameTask(this.numberName) + " завершилась");
        }
    }


}
