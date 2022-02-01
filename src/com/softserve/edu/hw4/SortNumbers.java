package com.softserve.edu.hw4;

import java.util.Scanner;

public class SortNumbers {

    public void sortNumbers(float a, float b, float c) {

        float max = a;
        float mid = b;
        float min = c;

        if (max < mid){
            float x = max;
            max = mid;
            mid = x;
        }
        if (max < min) {
            float x = min;
            min = max;
            max = x;
        }
        if (mid < min){
            float x = mid;
            mid = min;
            min = x;
        }

            System.out.println("Sorted numbers: \n" + min + "\n" + mid + "\n" + max);
}

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter your numbers: ");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();

        SortNumbers sort = new SortNumbers();
        sort.sortNumbers(a, b, c);

    }

}
