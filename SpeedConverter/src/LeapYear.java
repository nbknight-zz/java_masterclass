public class LeapYear {
    //write a method isLeapYear with a param int named year
    public static boolean isLeapYear(int year) {
        //if year is less than 1 or greater than 9999 return false
        if (year < 1 || year > 9999) { //if the year is not between 1 and 9999 it's false
            return false;
        } else if( year % 4 != 0){
            return false;
        } else if(year % 100 != 0) {
            return true;
        } else if(year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
