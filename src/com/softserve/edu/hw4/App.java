package com.softserve.edu.hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
   Homework4

   Прочитати з клавіатури три числа (цілих або дійсних).
   Вивести ці числа на екран у порядку зростання.
   Для коду використати пакет com.softserve.edu.hw4
   Запушати код на github у свою вітку.
 */
public class App {

    public static void main(String[] args) throws IOException {
        BufferedReader terminalReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your first number: ");
        String input0 = terminalReader.readLine();
        System.out.println("Enter your second number: ");
        String input1 = terminalReader.readLine();
        System.out.println("Enter your third number: ");
        String input2 = terminalReader.readLine();

        float[] inputNumbers = new float[3];
        inputNumbers[0] = Float.parseFloat(input0);
        inputNumbers[1] = Float.parseFloat(input1);
        inputNumbers[2] = Float.parseFloat(input2);

        Arrays.sort(inputNumbers);

        System.out.println("1st number from sorted result = " + inputNumbers[0]);
        System.out.println("2nd number from sorted result = " + inputNumbers[1]);
        System.out.println("3rd number from sorted result = " + inputNumbers[2]);
    }
}
