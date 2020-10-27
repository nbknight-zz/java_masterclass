package com.company;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int original = number;

        while(original != 0) {
            int lastDigit = original % 10;
            reverse *= 10;
            reverse += lastDigit;
            original /= 10;
            System.out.println(reverse); //so I can see the reverse number
        }
        System.out.println(number); //so I can see the original number
        return reverse == number;
    }
}