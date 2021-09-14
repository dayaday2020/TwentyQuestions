package TwentyQ;

import java.util.Arrays;

public class Question8 {
//    Question 8

    public static String extractAllOddNumbers(int[] numbers) {

        String OddNumbers = " ";
        for (int prints : numbers) {

            if (prints % 2 != 0) {
                OddNumbers = OddNumbers +  prints +" ";

            }
        }
        return OddNumbers;

    }
    public static void main (String[] args) {
        int[] boobsize= {31,30,33,34};
        System.out.println(extractAllOddNumbers(boobsize));
    }
}

