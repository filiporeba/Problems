package Problems;

public class GetSum {
    public static void main(String[] args) {
        System.out.println(GetSum(-22, 8));
    }

    public static int GetSum(int a, int b) {
        int sum = 0;
        if (a == b) return a;

        if (a < b) {
            while (a <= b) {
                sum += a;
                a++;
            }
        } else {
            while (b <= a) {
                sum += b;
                b++;
            }
        }
        return sum;
    }
}
