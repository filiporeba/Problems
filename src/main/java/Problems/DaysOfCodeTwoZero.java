package Problems;

import java.util.Scanner;

public class DaysOfCodeTwoZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int tmp;
        int w = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - 1; j++) {
                if (a[i] > a[j + 1]) {
                    tmp = a[i];
                    a[i] = a[j + 1];
                    a[j + 1] = tmp;
                    w++;
                }
            }
        }
        System.out.println("Array is sorted in " + w + " swaps.\n" +
                "First Element: " + a[0] + "\n" +
                "Last Element: " + a[n - 1] + "");
    }
}
