package TwentyQ;

public class Question13 {

//    Question 13
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        for (int i =1; i<=n; i++){
            System.out.println(str);
        }
        return str.repeat(n);
        }

    public static void main(String[] args) {
        System.out.println(printGivenStringTimesNumberGiven("Daya"+ "\n", 4));
    }
}

