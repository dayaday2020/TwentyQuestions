package TwentyQ;


public class Question11 {

    public static int getIndexByElement(String[] names, String element) {
        int getIndex = 0;

        for (int i = 0; i < names.length; i++){
            if (names[i].equals(element)) {
                getIndex = i;
            }
        }

        return getIndex;
    }



    public static void main(String[] args) {
        String[] names = {"lia", "jeremy", "jordan", "shannon"};
        System.out.println(getIndexByElement(names, "shannon"));


    }
}













