package com.robogame;

import java.util.Random;

public class Task  {


    private int taskNumber = 1;

    public void runTask() {
        switch (taskNumber) {
            case 1:
                task1();
                break;
            case 2:
                task2();
                break;
        }
    }

    public Task() {
        Random rnd = new Random(System.currentTimeMillis());
// Получаем случайное число в диапазоне от min до max (включительно)
        int n = 1 + rnd.nextInt(2);
        this.taskNumber = n;
    }

    private void task1() {
        // Инициализируем генератор
        Random rnd = new Random(System.currentTimeMillis());
// Получаем случайное число в диапазоне от min до max (включительно)
        int n = 2 + rnd.nextInt(20 - 2 + 1);
        System.out.println("Задача вычисления факторила числа " + Integer.toString(n));
        try {
            Thread.sleep(1000);
            do {
                int result = 1;
                for (int i = 2; i <= n; i++) {
                    result *= i;
                    System.out.println(result + "...вычисляю...");
                    Thread.sleep(3000);
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
            Thread.sleep(3000);

            System.out.println("У лукоморья дуб зелёный... ");
            Thread.sleep(3000);
            System.out.println("Златая цепь на дубе том:... ");
            Thread.sleep(3000);
            System.out.println("И днём и ночью кот учёный... ");
            Thread.sleep(3000);
            System.out.println("Всё ходит по цепи кругом;... ");
            Thread.sleep(3000);
            System.out.println("Идёт направо - песнь заводит,... ");
            Thread.sleep(3000);
            System.out.println("Налево - сказку говорит.... ");
            Thread.sleep(3000);
            System.out.println("Там чудеса: там леший бродит,... ");
            Thread.sleep(3000);
            System.out.println("Русалка на ветвях сидит;... ");
            Thread.sleep(3000);
            System.out.println("Там на неведомых дорожках... ");
            Thread.sleep(3000);
            System.out.println("Следы невиданных зверей;... ");
            Thread.sleep(3000);
            System.out.println("Избушка там на курьих ножках... ");
            Thread.sleep(3000);
            System.out.println("Стоит без окон, без дверей; ... ");
            Thread.sleep(3000);
            System.out.println("Задача 2 завершилась... ");


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
