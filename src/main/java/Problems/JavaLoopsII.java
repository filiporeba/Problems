package Problems;


import java.util.Scanner;

public class JavaLoopsII {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int result = 0;
        int x = 2;
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 1; j <= n; j++) {
                if (j == 1) {
                    result = a + j * b;
                    System.out.print(result + " ");
                    continue;
                }
                result += x * b;
                System.out.print(result + " ");
                x = x * 2;
            }
            System.out.println();
            x = 2;
        }
        in.close();
    }
}
