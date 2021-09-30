package TwentyQ;

public class Question10 {
//    Question 10
public static boolean contains(String[] names, String element) {

    for(String suckballs: names){
        if (suckballs == element) {
            return true;
        }
    }
       return false;
        }

    public static void main(String[] args) {
    String[] happy = {"cars","hoes","drugs","money"};
        System.out.println(contains(happy, "hoes"));
    }
}
