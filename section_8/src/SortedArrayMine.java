import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortedArrayMine {
    public static Integer[] getIntegers(Integer number) {
        Scanner scanner = new Scanner(System.in);
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

    public static Integer[] sortIntegers(Integer[] array) {

        for(int i = 0; i < array.length; i++) {
            Arrays.sort(array, Collections.reverseOrder());
        }
        return array;

    }

    public static void printArray(Integer[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", typed value was " + array[i]);
        }
    }

}
