package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
    }

    public static int sumDigits(int number) {
        if(number < 10) {
            return -1;
        }

        int sum = 0;

        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while(number > 0) {
            // extract the least significant digit
            System.out.println("The number is " + number);

            int digit = number % 10;
            System.out.println("The digit = " + digit);
            sum += digit;
            System.out.println("Sum = " + sum + digit);

            // drop the least significant digit
            number /= 10;
            System.out.println(number);
        }
        return sum;
    }
}
