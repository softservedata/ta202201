package com.softserve.edu.hw10;

// Задати два списки (ArrayList), які містять цілі значення.
// Кількість елементів у списках може бути різною, а самі елементи можуть дублюватися.
// Вияснити, чи контент елементів у списках співпадає. Наприклад, вміст наступних списків є однаковий [1, 2, 1, 2, 3] та [3, 3, 2, 2, 1, 1]
// Для коду використати пакет com.softserve.edu.hw10
// Запушати код на github у свою вітку.

public class App {
    public static void main(String[] args) {
        EqualListContentApp equalListContent = new EqualListContentAppImp();
        equalListContent.printCheckEqualContent();
    }
}
