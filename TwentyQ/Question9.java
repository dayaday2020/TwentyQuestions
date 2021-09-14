package TwentyQ;

public class Question9 {
    //    Question 9
    public static String extractAllEvenNumbers(int[] numbers) {
        String evenNum = " ";
        for (int prints : numbers) {

            if (prints % 2 == 0) {
                evenNum = evenNum + prints + " ";
            }
        } return evenNum;
    }
        public static void main (String[] args) {
            int[] boobsize= {31,30,33,34};
            System.out.println(extractAllEvenNumbers(boobsize));
    }}
