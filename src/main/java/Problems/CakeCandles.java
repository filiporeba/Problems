package Problems;

public class CakeCandles {

    static int birthdayCakeCandles(int[] ar) {
        int maks = Integer.MIN_VALUE;
        int same = 1;

        for (int value : ar) {
            if (value > maks) {
                maks = value;
            } else if (value == maks) {
                same++;
            }
        }
        return same;
    }
}
