package com.company;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if(number < 0) {
            return -1;
        }
        int firstNumber = 0;
        int workingNumber = number;
        int evenNumber = 0;
        while(workingNumber != 0) {
            firstNumber = workingNumber % 10;
            if(firstNumber % 2 == 0) {
                evenNumber += firstNumber;
            }
            workingNumber /= 10;

        }return evenNumber;

    }
}
