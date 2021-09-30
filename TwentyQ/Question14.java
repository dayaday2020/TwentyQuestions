package TwentyQ;

public class Question14 {

//      Question 14
    public static String repeatFirstThreeLetters(String str, int n) {
        String substr = str.substring(0,3);
        return substr.repeat(n);
        }

    public static void main(String[] args) {
        System.out.println(repeatFirstThreeLetters("chris",3));
    }
}

