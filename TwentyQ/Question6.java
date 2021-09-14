package TwentyQ;

import java.util.Arrays;

public class Question6{
//    Question 6
 public static int getSum(int[] ints) {
     int Sum = Arrays.stream(ints).sum();
     return Sum;


 }

    public static void main(String[] args) {
     int [] angelnum = {222,333,444,1111};
        System.out.println(getSum(angelnum));

    }
}
