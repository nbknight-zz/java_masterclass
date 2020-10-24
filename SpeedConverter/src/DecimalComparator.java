public class DecimalComparator {
    //write a method with two parameters of type double
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        //method returns true if two double numbers are the same up to 3 decimals
        //else false
        //narrow casting remove anything after the decimal
        int castA = (int) (a * 1000);
        int castB = (int) (b * 1000);
        if (castA == castB) {
            return true;
        } else {
            return false;
        }

    }
}
