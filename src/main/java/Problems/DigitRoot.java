package Problems;

public class DigitRoot {
    public static void main(String[] args) {
        System.out.println(digital_root(4565));
    }

    public static int digital_root(int n) {

        int sumaCyfr = 0;
        while (n > 0) {
            sumaCyfr += n % 10;
            n = n / 10;
        }
        if (sumaCyfr > 9) {
            return digital_root(sumaCyfr);
        }
        return sumaCyfr;
    }
}
