package com.company;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {


        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;


        while(true) {

            System.out.println("Enter some Numbers, and I'll tell you some math: ");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                sum += scanner.nextInt();
                count++;
            } else {
                System.out.println("Invalid Number given");
                break;
            }

            scanner.nextLine();

        }
        long ave = Math.round((double)sum / count);
        System.out.println("Sum = " + sum + " Ave = " + ave);

        scanner.close();
    }
}
