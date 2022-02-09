package com.softserve.edu06inher;

public class Appl {

    // Overload
    public void myPrint() {
        System.out.println("public static void myPrint()");
    }

    // Overload
    public void myPrint(int i) {
        System.out.println("public static void myPrint(int i), i = " + i);
    }

    public static void main(String[] args) {
        //
        Appl app = new Appl();
        app.myPrint();
        app.myPrint(456);
        //
        /*-
        B b = new B();
        System.out.println("i = " + b.getI());
        */
        /*-
        int i = 1234;
        double d = i;
        System.out.println("i = " + i + "  d = " + d);
        //
        d = 234.51;
        i = (int) d; // Code Smell;
        System.out.println("i = " + i + "  d = " + d);
        */
        /*-
        A a = new A(14);
        System.out.println("i = " + a.getI());
        B b = new B();
        //
        // b=a; // Error
        a = b;
        System.out.println("i = " + a.getI());
        System.out.println("j = " + ((B) a).j); // Code Smell;
        */
        /*-
        A a = new B(); //(15);
        System.out.println("i = " + a.getI());
        if (a instanceof B) {
            System.out.println("j = " + ((B) a).j);
        }
        a.m(); // Code Smell;
        A.m();
        B.m();
        */
    }
}
