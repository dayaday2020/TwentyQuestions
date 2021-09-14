package TwentyQ;

public class Question5 {
//    Question 5

    public static String getSecondToLastElement(String[] names) {
         String music =names[names.length -2];
        return music;}

    public static void main(String[] args) {
        String[]  fave3 = {"r&b","rock","rap",};
        System.out.println(getSecondToLastElement(fave3));
    }
}
