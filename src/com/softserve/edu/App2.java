package com.softserve.edu;

import java.sql.SQLOutput;

public class App2 {
    private int i = 123; // = 0; by default

//    public App2() {
//        System.out.println("Constructor");
//    }

    public void myPrint() {
        System.out.println("myPrint() i = " + i); // i.toString()
    }


    public static void main(String[] args) {
        System.out.println("Hello");
        int i = 456;
        // int i;
        //
        App2 app = new App2(); // Call Constructor\
        App2 app2 = new App2(); // Call Constructor
        app2.i = 321;
        System.out.println("app.i = " + app.i);
        System.out.println("i = " + i);
        app.myPrint(); // 123
        app2.myPrint(); // 321
        //app2 = null;
        //
        i = 49;
        System.out.println("i = " + i); // 49
        System.out.println("(char) i = " + (char) i); // 1
        System.out.println("Symbols for their characters output below:");
        int cod = 33;
        int symb = cod;
        int end = cod +30;
        System.out.println("Character codes " + cod + " till " +end + ":");
        while (cod <= end) {
            System.out.print(cod + " ");
            cod++;
        }
        System.out.println("");
        System.out.println("Their corresponding symbols: ");
        while (symb <= end) {
            System.out.print((char)symb + " ");
            symb++;
        }
    }

}
