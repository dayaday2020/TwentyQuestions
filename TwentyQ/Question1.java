package TwentyQ;

public class Question1 {
//    Question1
public static int getLastIndex(String[] names) {
    int getLastIndex = names.length -1;
     return  getLastIndex;
        }

    public static void main(String[] args) {
    String[] friends= {"jordan", "boris", "lia"};
        System.out.println(getLastIndex(friends));


    }
}
