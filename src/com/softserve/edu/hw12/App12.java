package com.softserve.edu.hw12;

/*Homework 12 (from 16.03.2022)
        1) Замінити у тестовому файлі всі входження слова Welcome на Hello
        Для коду використати пакет com.softserve.homework12
        Запушати код на github у свою вітку.*/

import java.io.*;

public class App12 {
    public static void main(String[] args) {
        String fileName = "src/com/softserve/edu/hw12/hello.txt";
        String income = "Welcome";
        String outcome = "Hello";
        BufferedReader br = null;
        FileWriter fw = null;

        try {

            br = new BufferedReader(new FileReader(fileName));

            String line = br.readLine();
            System.out.println("Original file: " + line);
            br.close();

            String newLine = line.replace(income, outcome);
            System.out.println("New file: " + newLine);

            fw = new FileWriter(fileName);
            fw.write(newLine);
            fw.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
