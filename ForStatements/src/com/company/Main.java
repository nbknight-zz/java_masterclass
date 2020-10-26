package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0,2.0));

        // basic for loop structure is
        //for(init; termination; increment)
        System.out.println("\n A basic for loop");
        for(int i=0; i<5; i++) {
            System.out.println(i);
        }
        //Let's loop forward
        System.out.println("\n Looping forward");
        for(int i=2; i<9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0,i));

        }
        //for precise number of zeros
        System.out.println("\n With only 2 trailing 00's");
        for(int i=2; i<9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0,i)));
        }
        //Going backwards
        System.out.println("\n Now going backwards");
        for(int i=8; i>1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0,i)));
        }

        System.out.println("\n Increasing prime numbers");
        int count = 0;
        for(int i=10; i<50; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println(i + " is a prime number");
                if (count == 3) {
                    System.out.println("Exiting for loop\n");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        //method 1
        return(amount * (interestRate/100));
    }



    public static boolean isPrime(int n) {
        if(n==1){
            return false;
        }

        for(int i=2; i<=n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
