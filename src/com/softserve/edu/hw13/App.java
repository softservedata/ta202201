package com.softserve.edu.hw13;

//Homework 13 (from 18.03.2022)
//Створити список List<String> names; з іменами людей.
//Посортувати цей список спочатку по кількості символів у імені, а в межах однакової кількості - по алфавіту.
//Для сортування використати лямда вираз Collections.sort( (name1,name2)-> ... );
//Явно клас нащадка компаратора не створювати.
//Для коду використати пакет com.softserve.homework13
//Запушати код на github у свою вітку.

public class App {
    public static void main(String[] args) {
        LambdaSortingApp sortingApp = new LambdaSortingAppImp();
        sortingApp.printSortedPeople();
    }
}
