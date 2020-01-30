package Problems;

public class StringToIntegerAtoi {
    public static void main(String[] args) {
        System.out.println(myAtoi(" "));
    }


    public static int myAtoi(String str) {
        String word = str.trim();

        if (word.length() < 1 || word == null) {
            return 0;
        }

        char firstLetter = '+';
        int i = 0;

        if (word.charAt(0) == '-') {
            firstLetter = '-';
            i++;
        } else if (word.charAt(0) == '+') {
            i++;
        }
        double number = 0;

        while (word.length() > i && word.charAt(i) >= '0' && word.charAt(i) <= '9') {
            number = number * 10 + (word.charAt(i) - '0');
            i++;
        }

        if (firstLetter == '-')
            number = -number;

        if (number > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        if (number < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return (int) number;
    }
}
