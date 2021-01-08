import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    //create a new instance of scanner
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* My main
        Integer[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        sortIntegers(myIntegers);
        printArray(myIntegers);
        */
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);

    }

    //Need a method to get the integers from user input

    //create an array of integers
    /*My solution
    public static Integer[] getIntegers(Integer number) {
        //ask for the user input
        System.out.println("Enter " + number + " integer values\r");
        //create an array to store the numbers passed
        Integer[] values = new Integer[number];
        //use a for loop to add user input into the array
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        //return the values
        return values;
    }

    //Need a method that sorts the arrays
    public static Integer[] sortIntegers(Integer[] array) {

        for(int i = 0; i < array.length; i++) {
            Arrays.sort(array, Collections.reverseOrder());
        }
        return array;

    }

    //Need a method that prints the arrays
    public static void printArray(Integer[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", typed value was " + array[i]);
        }
    }

    */

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for(int i=0; i<array.length; i++){
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int i = 0; i<sortedArray.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag=true;
                }
            }
        }
        return sortedArray;

    }
}
