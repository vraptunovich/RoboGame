package com.robogame;

import java.io.*;
import java.util.Date;

/**
 * Класс для вывода логированной информации
 */
public class Log {
    public String str = "";
    public Date date;
    OutputStream f;
    OutputStreamWriter writer;
    BufferedWriter out;

    public Log() {
        try {
            f = new FileOutputStream("File.txt", false);
            writer = new OutputStreamWriter(f);
            out = new BufferedWriter(writer);
            out.write(new Date(System.currentTimeMillis()).toString() + "\n" + " Начало логирования" + " \r\n");
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addLog(String s) {
        try {
            out.write(new Date(System.currentTimeMillis()).toString() + ":" + s + " \r\n");
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void showMeassage(String s) {
        System.out.println(s);
    }
}
