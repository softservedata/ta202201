package com.softserve.edu.hw12;

//Homework 12 (from 16.03.2022)
//Замінити у тестовому файлі всі входження слова Welcome на Hello
//Для коду використати пакет com.softserve.homework12
//Запушати код на github у свою вітку.

public class App {
    public static void main(String[] args) {
        FileAppImp fileAppImp = new FileAppImp("src/com/softserve/edu/hw12/text.txt");
        fileAppImp.replaceTextInFile();
    }
}
