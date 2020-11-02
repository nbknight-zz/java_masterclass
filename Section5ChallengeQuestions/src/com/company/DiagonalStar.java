package com.company;

public class DiagonalStar {

    public static void printSquareStar(int number) {
        //If number is < 5, the method should print "Invalid Value".
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number; col++) { //if the col or row is 1st or last
                if (row == 1 || row == number || col == 1 || col == number) {
                    System.out.print("*");
                } else if (row == col) { //When the row number equals the column number
                    System.out.print("*");
                } else if (col == (number - row + 1)) { //When the column number equals rowCount - currentRow + 1
                    System.out.print("*");
                } else
                    System.out.print(" ");
                }//close inner loop
                System.out.println();
            }
        }
    }

