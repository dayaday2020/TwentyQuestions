package TwentyQ;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Question7 {
//    Question 7
public static OptionalDouble getAverage(int[] ints) {
    OptionalDouble average = Arrays.stream(ints).average();
    return average;
        }

    public static void main(String[] args) {
    int[] boobsize= {32,30,36,34};
        System.out.println(getAverage(boobsize));

    }
}
