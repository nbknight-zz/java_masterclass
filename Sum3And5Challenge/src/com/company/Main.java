package com.company;

public class Main {

    public static void main(String[] args) {

//       int count = 0;
//       for(int i = 1; i<=1000; i++) {
//           if((i % 3 == 0) && (i % 5 == 0)) {
//               count++;
////               int total = count += i;
////               System.out.println(total);
//               System.out.println(i);
//               if (count == 5) {
//                   System.out.println("No mas!\n");
//                   break;
//               }
//           }
//        }

       //His way
        int count = 0;
       int sum = 0;

       for(int i=1; i <= 1000; i++) {
           if((i % 3 == 0) && (i % 5 == 0)) {
               count ++;
               sum += i;
               System.out.println("Found number = " + i);
           }

           if(count == 5) {
               break;
           }
       }

        System.out.println("Sum = " + sum);
    }
}
