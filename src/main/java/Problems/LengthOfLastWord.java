package Problems;

import java.util.Scanner;

public class LengthOfLastWord {
    public static void main(String[] args) {
        lengthOfLastWord("hello world");
    }

    public static int lengthOfLastWord(String s) {
        Scanner scanner = new Scanner(s);
        int result = 0;
        while (scanner.hasNext()) {
            result = scanner.next().length();
        }
        return result;
    }
}
