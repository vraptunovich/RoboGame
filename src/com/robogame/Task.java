package com.robogame;

import java.util.Random;

public class Task {

private static int temp=1;
    private int taskNumber = 1;
    private int timePause = 4000;

    public void setTimePause(int timePause) {
        this.timePause = timePause;
    }

    public void runTask() {
        switch (taskNumber) {
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

    public Task() {
        Random rnd = new Random(System.currentTimeMillis());
// Получаем случайное число в диапазоне от min до max (включительно)

       /* do {
              n = 1 + rnd.nextInt(3);
        } while (n!=temp);
        this.temp=n;
        */
        int n=this.temp;

        this.temp++;
        if (this.temp==4)
            this.temp=1;

        this.taskNumber = n;
        System.out.println("Создана задача" + n);
    }

    private void task1() {
        // Инициализируем генератор
        Random rnd = new Random(System.currentTimeMillis());
// Получаем случайное число в диапазоне от min до max (включительно)
        int n = 2 + rnd.nextInt(13 - 2 + 1);
        System.out.println("Задача вычисления факторила числа " + Integer.toString(n));
        try {
            Thread.sleep(timePause+2000);
            do {
                int result = 1;
                for (int i = 2; i <= n; i++) {
                    result *= i;
                    System.out.println(result + "...вычисляю...");
                    Thread.sleep(timePause+2000);
                }
                System.out.print("Факторил числа " + n + " равен:");
                System.out.println(result);
                if (n == 0 || n == 1) {
                    System.out.print("Факторил числа " + n + " равен:");
                    System.out.println(result);
                }
            } while (n < 0);
            {
                System.out.println("Задача 1 завершилась");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void task2() {
        System.out.println("Сейчас я буду читать вам стихотворение... ");

        try {
            Thread.sleep(timePause);

            System.out.println("У лукоморья дуб зелёный... ");
            Thread.sleep(timePause);
            System.out.println("Златая цепь на дубе том:... ");
            Thread.sleep(timePause);
            System.out.println("И днём и ночью кот учёный... ");
            Thread.sleep(timePause);
            System.out.println("Всё ходит по цепи кругом;... ");
            Thread.sleep(timePause);
            System.out.println("Идёт направо - песнь заводит,... ");
            Thread.sleep(timePause);
            System.out.println("Налево - сказку говорит.... ");
            Thread.sleep(timePause);
            System.out.println("Там чудеса: там леший бродит,... ");
            Thread.sleep(timePause);
            System.out.println("Русалка на ветвях сидит;... ");
            Thread.sleep(timePause);
            System.out.println("Там на неведомых дорожках... ");
            Thread.sleep(timePause);
            System.out.println("Следы невиданных зверей;... ");
            Thread.sleep(timePause);
            System.out.println("Избушка там на курьих ножках... ");
            Thread.sleep(timePause);
            System.out.println("Стоит без окон, без дверей; ... ");
            Thread.sleep(timePause);
            System.out.println("Задача 2 завершилась... ");


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void task3() {
        System.out.println("Всем оставаться на местах, иначе я взорву себя... ");

        try {
            Thread.sleep(timePause+1000);
            Random rnd = new Random(System.currentTimeMillis());
// Получаем случайное число в диапазоне от min до max (включительно)
            int n = 20 + rnd.nextInt(30);
            System.out.println("обратный отсчет... ");
            Thread.sleep(timePause+1000);
            while (n != 0) {
                System.out.println(n + "...");
                Thread.sleep(timePause+1000);
                n--;
            }
            System.out.println("Задача 2 завершилась... ");


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
