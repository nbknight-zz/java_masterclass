public class Kata
{
    public static int squareSum(int[] n)
    {
        int sum = 0;
//        int square = n[0];
        for(int i = 0; i < n.length; i++) {
            int square;
            System.out.println("i = " + i);
//            square = i*i;
//            System.out.println("square = " + square);
            sum += n[i]*n[i];
            System.out.println("sum = " + sum);
        }
        return sum;
        //Your Code
    }
}