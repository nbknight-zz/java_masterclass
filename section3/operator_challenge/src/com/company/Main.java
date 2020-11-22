package com.company;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {
        double step1 = 20.00;
        double step2 = 80.00;
        double step3 = (step1 + step2) * 100.00;
        System.out.println(step3);
        double step4 = step3 % 40.00;
        System.out.println(step4);

//        boolean step5 = true;
//        if (step4 == 0) {
//            System.out.println(step5);
//        } else {
//            System.out.println("Got Some remainder");
//        }

        boolean step5 = (step4 == 0) ? true : false;
        System.out.println("step 4 = " + step4);
        if (!step5) {
            System.out.println("Got some remainder");
        }
    }
}
