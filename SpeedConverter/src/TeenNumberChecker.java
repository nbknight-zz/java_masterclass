public class TeenNumberChecker {
    //write a method named hasTeen with 3 params of type int
    public static boolean hasTeen(int a, int b, int c) {
        //if one of the params is in the inclusive range 13 - 19
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
            return true; //return true
        } else {
            return false;
        }
    }

    public static boolean isTeen(int a) {
        //if one of the params is in the inclusive range 13 - 19
        if (a >= 13 && a <= 19) {
            return true; //return true
        } else {
            return false;
        }
    }
}
