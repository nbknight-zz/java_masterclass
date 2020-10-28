package com.company;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
    }

//    public static boolean canPack(int bigCount, int smallCount, int goal) {
//
//        for (int i = 0; i <= bigCount; i++) {
//            for (int j = 0; j <= smallCount; j++) {
//                if (((i * 5) + j) == goal) {
//                    System.out.println((i * 5));
//                    System.out.println((i * 5)+ j);
//                    System.out.println(goal);
//
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
}
