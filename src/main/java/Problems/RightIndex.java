package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RightIndex {
    public static void main(String[] args) {
        int[] tab = {2, 2, 3, 4, 7, 8, 12, 6, 7, 13, 6, 2, 3, 23, 4, 5};

        System.out.println(Arrays.toString(RightIndex(tab, 11)));
    }

    public static int[] RightIndex(int[] tab, int number) {
        List<Integer> linked = Arrays.stream(tab).boxed().collect(Collectors.toList());
        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < linked.size() - 1; i++) {
            if (linked.get(i) < number && linked.get(i + 1) >= number) {
                indexes.add(i + 1);
            }
        }
        int count = 0;
        for (int i = 0; i < indexes.size(); i++) {
            linked.add(indexes.get(i) + count, number);
            count++;
        }

        int[] resultTab = new int[linked.size()];
        for (int i = 0; i < linked.size(); i++) {
            resultTab[i] = linked.get(i);
        }

        return resultTab;
    }
}
