public class Main {
    public static void main(String[] args) {
//        int newScore = calculateScore("Time", 500);
//        System.out.println("New score is " + newScore);
//        calculateScore(75);
//        calculateScore();
//        calcFeetAndInchesToCentimeters(6,0);
//        calcFeetAndInchesToCentimeters(157);
//        System.out.println(SecondsAndMinutes.getDurationString(65,45));
//        System.out.println(SecondsAndMinutes.getDurationString(3945L));
//        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
//        IntEqualityPrinter.printEqual(1, 1, 1);
//        IntEqualityPrinter.printEqual(1, 1, 2);
//        IntEqualityPrinter.printEqual(-1, -1, -1);
//        IntEqualityPrinter.printEqual(1, 2, 3);
        PlayingCat.isCatPlaying(true, 10);

    }
//
//    public static int calculateScore(String playerName, int score) {
//        System.out.println("Player " + playerName + " scored " + score + " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore(int score) {
//        System.out.println("Unnamed player scored" + " scored " + score + " points");
//        return score * 1000;
//    }

//    public static int calculateScore() {
//        System.out.println("Unnamed player with no score");
//        return 0;
//    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet < 0 || inches < 0 || inches > 12) {
            System.out.println("That's a big negative");
            return -1;
        }else {
            double cm = 2.54;
            double inToCm = inches * cm;
            double ftToCm = feet * 12 * cm;
            System.out.println(inToCm + ftToCm);
            return inToCm + ftToCm;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0) {
            System.out.println("That's a big negative for method 2");
            return -1;
        }else {
//            double cm = 2.54;
//            double inToCm = inches * cm;
//            System.out.println(inToCm);
//            return inToCm;
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(remainingInches);
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
    }

}

