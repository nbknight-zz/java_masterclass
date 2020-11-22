public class EqualSumChecker {
    //write a method hasEqualSum with 3 int parameters
    public static boolean hasEqualSum(int a, int b, int c) {
        //if the sum of the first and second param equal the third param
        if((a+b) == c) {
            return true; //return true
        } else {
            return false; //else return false
        }
    }
}
