package com.company;

public class Main {

    public static void main(String[] args) {
//        int value = 3;
//        if (value ==1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        //Now with a switch statement
//        int switchValue = 6;
//        switch(switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//
//            case 2:
//                System.out.println("Value was 2");
//                break;
//
//            case 3: case 4: case 5:
//                System.out.println("Was a 3, or a 4, or a 5");
//                System.out.println("Actually it was a " + switchValue);
//                break;
//
//            default:
//                System.out.println("Was not 1 - 5");
//                break;
//        }

        char newChar = 'F';
        switch(newChar) {
            case 'A':case 'B': case 'C': case 'D': case 'E':
                System.out.println("The value was " + newChar);
                break;
            default:
                System.out.println("Letters A - E were not found.");
        }

        String month = "December";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "december":
                System.out.println("My birthday month");
                break;
            default:
                System.out.println("Huh?");
        }
    }
}
