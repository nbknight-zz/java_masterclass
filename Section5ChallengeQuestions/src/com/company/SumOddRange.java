package com.company;

public class SumOddRange {
    public static boolean isOdd(int number) {
        if(number <= 0) { //Is the number greater than 0:
            return false;
        } else {
            return (number % 2 != 0); //Is the number odd?
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        //end should greater than start
        //neither ints should be less than 0
        if((end < start) || (end < 0) || (start < 0)){
            return -1;
        } else {
            for(int i = start; i<=end; i++) {
                //is i odd?
                if(isOdd(i)) {
                    sum += i; //if so, sum i
                }
            }
        }return sum;
    }
}
