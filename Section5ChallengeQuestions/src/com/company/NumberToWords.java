package com.company;

public class NumberToWords {
    public static void numberToWords(int number) {
        //should print out the passed number using words for the digits
        if(number < 0) {
            System.out.println("Invalid Value");
        }
        int workingNumber = 0;
        int reverseNumber = reverse(number);
        if(number == 0) {
            System.out.println("Zero");
        }
        while(reverseNumber > 0) {
            int switchNumber = reverseNumber % 10;
            switch(switchNumber) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;

                default:
                    System.out.println("OTHER");

            }
            reverseNumber /= 10;
        }

        for(int i = getDigitCount(reverse(number)); i < getDigitCount(number); i++) {
            System.out.println("Zero");
        }
    }

    public static int reverse(int number) {
        //returns the reverse of the number passed
        int reverseNumber = 0;

        while(number != 0) {
            int iterator = number % 10;
            reverseNumber *= 10;
            reverseNumber += iterator;
            number /= 10;

        }return reverseNumber;

    }

    public static int getDigitCount(int number) {
        //returns the count of the digits passed.
        //negative numbers should return -1
        int count = 0;
        if(number < 0) {
            return -1;
        } else if(number == 0) {
            count++;
        }
        while(number > 0){
            number /= 10;
            count++;
        }
        return count;
    }
}
