package Problems;

import java.util.ArrayList;
import java.util.List;

public class SmallestLargestSubstr {
    public static void main(String[] args)  {
        System.out.println(getSmallestAndLargest("welcometojava", 3));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        List<String> list = new ArrayList<>();

        for (int i = 0; i <= s.length() - k; i++) {
            list.add(s.substring(i, i + k));
        }
        list.sort(((o1, o2) -> o1.compareTo(o2)));

        smallest = list.get(0);
        largest = list.get(list.size() - 1);

        return smallest + "\n" + largest;
    }
}
