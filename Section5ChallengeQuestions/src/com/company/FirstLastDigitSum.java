package com.company;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) {
            return -1;
        }
        int firstNumber = 0;
        int workingNum = number;

        while (workingNum != 0) { //have to account for negatives
            firstNumber = workingNum % 10; // grab the last number
            workingNum /= 10; // shift a place to grab the next number
            //It'll loop through until it hits the first number. After that it would be
            //= to 0.
        }

        int lastNumber = number % 10; //grabs the last number
        return firstNumber + lastNumber;
    }
}


//public class FirstLastDigitSum {
//
//    public static int sumFirstAndLastDigit(int number) {
//
//        if(number < 0) {
//            return -1;
//        }
//
//        int lastDigit = 0;
//        int n = number;
//
//        while (n != 0) {
//            lastDigit = n % 10;
//            System.out.println("Last Digit is: " + lastDigit);
//            n /= 10;
//            System.out.println("N is: " + n);
//        }
//
//        int firstDigit = number % 10;
//        System.out.println("First Digit is: " + firstDigit);
//        return firstDigit + lastDigit;
//
//    }
//}