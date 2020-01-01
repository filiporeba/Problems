package Problems;

import java.util.Arrays;

public class SpinWords {
    public static void main(String[] args) {
        System.out.println(spinWords("sentence to reverse"));
    }

    public static String spinWords(String sentence) {

        String[] name = sentence.split(" ");
        String a = "";
        for (int i = 0; i < name.length; i++) {
            if (name[i].length() >= 5) {
                name[i] = new StringBuffer(name[i]).reverse().toString();
            }
        }
        a = Arrays.toString(name);

        return a = a.substring(1, a.length() - 1).replaceAll(",", "");
    }
}
