package Problems;

import java.util.Scanner;

public class DaysOfCodeSeven {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
        method();
    }

    static void method() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String[] names = new String[a];
        for (int i = 0; i < a; i++) {
            names[i] = scanner.next();
        }
        for (String e : names) {
            for (int i = 0; i < e.length(); i++) {
                if(i % 2 == 0) {
                    System.out.print(e.charAt(i));
                }
            }
            System.out.print(" ");
            for (int i = 0; i < e.length(); i++) {
                if(i % 2 != 0) {
                    System.out.print(e.charAt(i));
                }
            }
            System.out.println();
        }
    }
}
