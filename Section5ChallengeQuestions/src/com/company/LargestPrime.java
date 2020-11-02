package com.company;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if(number <= 1) {
            return -1;
        }
        int divisor = 0;
        for(int i = 2; i <= number/2; i++) {
            if(number % i == 0) {
                number /= i;
                i--;
            }


        }return number;
    }
}
