public class Kata {
    public static void main(String[] args) {
//        System.out.println(solution("world"));
        hackerRank2(24);
    }
//
//    public static String solution(String str){
//        return new StringBuilder(str).reverse().toString();

//    }

    /*
    Given an integer, n, perform the following conditional actions:

    If n is odd, print Weird
    If n is even and in the inclusive range of 2 to 5, print Not Weird
    If n is even and in the inclusive range of 6 to 20, print Weird
    If n is even and greater than 20, print Not Weird
    Complete the stub code provided in your editor to print whether or not  is weird
    */

    public static void hackerRank2(int N){
//        if(N%2 != 0) {
//            System.out.println("Weird");
//        }else if(N >= 2 && N<= 5 || N > 20){
//            System.out.println("Not Weird");
//        }else {
//            System.out.println("Weird");
//        }
        if(N%2 == 0 && N >= 2 && N<= 5 || N > 20) {
            System.out.println("Not Weird");
        }else {
            System.out.println("Weird");
        }
    }
}
