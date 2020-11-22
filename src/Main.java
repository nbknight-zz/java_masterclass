import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //initialize the scanner
        Scanner scanner = new Scanner(System.in);
        int counter = 0; //counts the valid numbers
        int sum = 0; //sum of counted numbers

        while(true) { //never completes, so it will need a break statement
            int order = counter + 1; //impacts the message to the user
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if(counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine(); // handle end of line (enter key)


        }
        System.out.println("Sum = " + sum);
        //close the scanner
        scanner.close();
    }
}
