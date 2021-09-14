package TwentyQ;

public class Question2 {
//    Question2
    public static int getSecondToLastIndex(String[] names) {
        int getSecondToLastIndex = names.length -2;
        return getSecondToLastIndex;
    }

    public static void main(String[] args) {
 String[] classmates = {"jade", "boris", "jordan"};
        System.out.println(getSecondToLastIndex(classmates));



    }

}

