import java.util.Scanner;

public class MinimumElement {

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What size would you like your array? ");
        int arraySize = scanner.nextInt();
        return arraySize;
    }

    private static int[] readElements(int arraySize) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[arraySize];
        for(int i = 0; i < array.length; i++) {
            System.out.println("Give me a number: \r");
            int number = scanner.nextInt();
            array[i] = number;
        }
        return array;
    }

    private static int findMin (int[] array) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}