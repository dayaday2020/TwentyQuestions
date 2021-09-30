package TwentyQ;

public class Question15 {
    //        Question 15
// Write a java method to count all the words in a string

public static boolean WordsInAStringCounter(String str){
    int count = 0;
    boolean word = false;
    int endstring = str.length() -1;
    char[] aLetter = str.toCharArray();

    for (int i =0; i <str.length();i++){
        if (Character.isLetter(aLetter[i]) && i !=endstring) {
            word = true;
        } else if (!Character.isLetter(aLetter[i]) && word) {
            count++;
            word = false;
            } else if (Character.isLetter(aLetter[i]) && i == endstring) {
            count++;
        }
        }

       return word;
       }

    public static void main(String[] args) {
        System.out.println(WordsInAStringCounter("just run dude"));
    }
}
