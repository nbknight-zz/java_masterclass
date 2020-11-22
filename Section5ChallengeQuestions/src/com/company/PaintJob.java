package com.company;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        //number of buckets that Bob needs to buy before going to work
        //if width, height, or areaPerBucket <= 0 or extraBuckets < 0 return -1
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        //method needs to calculate the number of buckets
        double area = width * height;
        double numBuckets = Math.ceil((area/areaPerBucket) - extraBuckets);
        int n = (int) numBuckets;
        return n;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        //return the value of type int that represents the number of buckets that Bob needs to buy before going to work
//        double numBuckets = 0;
        //If one of the parameters width, height or areaPerBucket is less or equal to 0, the method needs to return -1
        if( width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;
        double numBuckets = Math.ceil(area/areaPerBucket);
        int n = (int) numBuckets;

        return n;

        //the method needs to calculate the number of buckets and return it
    }

    public static int getBucketCount(double area, double areaPerBucket){
        //needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work

        //If one of the parameters area or areaPerBucket is less or equal to 0, the method needs to return -1
        if(area <=0 || areaPerBucket <= 0){
            return -1;
        }
        //method needs to calculate the number of buckets and return it.
        double numBuckets = Math.ceil(area/areaPerBucket);
        int n = (int) numBuckets;
        return n;

    }
}
