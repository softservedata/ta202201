package com.softserve.edu;

import java.lang.reflect.Field;

/**
 * This is a sample class which is used to demonstrate the use of multi-line comments.
 * This comment does not appear in the java documentation
 */
public class App2 {
    private int i = 123; // = 0; by default

//    public App2() {
//        System.out.println("Constructor");
//    }

    public void myPrint() {
        //List<String> s;
        System.out.println("myPrint() i = " + i); // i.toString()
    }

    /*-
     * a                    b
     * c                    d
     * e    f
     */
    public static void main(String[] args) {
        System.out.println("Hello");
        int i = 456;
        // int i;
        //
        App2 app = new App2(); // Call Constructor\
        App2 app2 = new App2(); // Call Constructor
        app2.i = 321;
        // Print text to console // ERROR
        System.out.println("app.i = " + app.i);
        System.out.println("i = " + i);
        app.myPrint(); // 123
        app2.myPrint(); // 321
        //app2 = null;
        //
        i = 49;
        System.out.println("i = " + i); // 49
        System.out.println("(char) i = " + (char) i); // 1
        //
        // This example demonstrates the use of single line comments
        byte b = 126;
        b = (byte) (b + 1);
        System.out.println("b = " + b);
        //
        /*
         This is a sample class which is used to demonstrate the use of multi-line comments.
         This comment does not appear in the java documentation
        */
        Class<?> c = App2.class;
        c = app.getClass();
        System.out.println("name = " + c.getName());
        Field[] fields = c.getDeclaredFields();
        for (int i2 = 0; i2 < fields.length; i2++) {
            System.out.println("Type = " + fields[i2].getType().getName() + "  name = " + fields[i2].getName());
        }
        //
        com.softserve.edu00.A a0 = new com.softserve.edu00.A();
        com.softserve.edu01.A a1 = new com.softserve.edu01.A();
    }

}
