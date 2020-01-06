package Problems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        romanToInt("xcix");
    }

    public static int romanToInt(String s) {
        Map<String, Integer> change = new LinkedHashMap<>();
        change.put("I", 1);
        change.put("V", 5);
        change.put("X", 10);
        change.put("L", 50);
        change.put("C", 100);
        change.put("D", 500);
        change.put("M", 1000);

        String number = s.toUpperCase();
        int result = 0;
        int prev = 0;

        for (int i = number.length() - 1; i >= 0; i--) {
            String first = String.valueOf(number.charAt(i));
            int tmp = change.get(first);

            if (tmp < prev)
                result -= tmp;
            else
                result += tmp;

            prev = tmp;
        }
        return result;
    }
}
