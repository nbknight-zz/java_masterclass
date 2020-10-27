package com.company;

public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        if((a < 10 || a > 99) || (b < 10 || b > 99)) {
            return false;
        }

        int A1 = 0;
        int A2 = 0;
        int B1 = 0;
        int B2 = 0;

        int num1 = a;
        int num2 = b;

        while(num1 != 0 && num2 != 0) {
            A1 = num1 % 10;
            num1 /= 10;
            B1 = num2 % 10;
            num2 /= 10;
        }

        A2 = a % 10;
        B2 = b % 10;
        return ((A1 == B1 || A1 == B2 ) || (A2 == B1 || A2 == B2));
    }
}
