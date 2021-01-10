import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int[] array){
        System.out.println("Array = " + Arrays.toString(array));
        int maxLength = array.length - 1;
        int halfLength = array.length / 2;
        for(int i = 0; i< halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxLength - i];
            array[maxLength - i] = temp;


        }
        System.out.println("Reversed Array = " + Arrays.toString(array));

    }



    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        reverse(array);

    }


}
