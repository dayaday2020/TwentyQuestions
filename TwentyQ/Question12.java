package TwentyQ;

public class Question12 {
//    Question 12
    public static void printOddNumbersInRange(int start, int end){
        int i =start;
        while (i <= end) {
            if (i % 2 != 0) {

                System.out.println(i);
            }
            i++;
        }
    }

    public static void main(String[] args) {
        printOddNumbersInRange(1,20);
    }


}


