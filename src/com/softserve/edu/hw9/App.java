package com.softserve.edu.hw9;

// Задати два списки (ArrayList), які містять цілі значення.
// На підставі цих двох лістів створити новий List, який містить лише спільні елементи з обох заданих списків.
// Для коду використати пакет com.softserve.homework9
// Запушати код на github у свою вітку.

public class App {
    public static void main(String[] args) {
        IntersectionApp intersectionApp = new IntersectionAppImp();
        intersectionApp.printGeneratedIntersectionList();
    }
}
