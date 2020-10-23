public class BarkingDog {
    //write a method, shouldWakeUp with 2 params, a bool named barking and an int hourOfDay
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        // if hour of day is less than 0 or greater than 23 return false
        if(hourOfDay < 0 || hourOfDay > 23) {
            return false;
            // if hour of day is less than 8 or equal to 22 and the dog is barking, return true
        } else if ((hourOfDay < 8 || hourOfDay == 23) && barking) {
            return true;
            // anything else should be false
        } else {
            return false;
        }
    }
}

