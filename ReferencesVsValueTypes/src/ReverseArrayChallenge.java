import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArrayChallenge {

    public static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for(int i = 0; i < halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i ];
            array[maxIndex - i] = temp;
        }

    }
}