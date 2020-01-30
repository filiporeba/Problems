package Problems;

public class ReverseString {
    public void reverseString(char[] s) {
        char tmp;
        int counter = 0;
        for (int i = s.length - 1; i > s.length/2; i--) {
            tmp = s[counter];
            s[counter] = s[i];
            s[i] = tmp;
            counter++;
        }
    }
}
