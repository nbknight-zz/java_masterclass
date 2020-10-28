package com.company;

public class Main {

    public static void main(String[] args) {
//        int count = 1;
//        while(count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//
//        }
//        System.out.println("\n");
//        count = 1;
//        while(true) {
//            if(count == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }
//        System.out.println("\n");
//        //dowhile
//        count = 6;
//        do {
//            System.out.println("Count value was " + count);
//            count ++;
//
//            if(count > 100) {
//                break;
//            }
//        } while(count != 6);
//        System.out.println(isEvenNumber(4));

        int number = 4;
        int finishedNumber = 20;
        int count = 0;

        while (number <= finishedNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            count++;
            if(count >=5) {
                break;
            }




        }
        System.out.println("Total even numbers found = " + count);


    }
    //Is number even?
    public static boolean isEvenNumber(int a) {
        return a % 2 == 0;
    }
}
