package Problems;

public class MiniMaxSum {

    static void miniMaxSum(int[] arr) {
        long max = 0;
        long min = 0;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if(i == 0) {
                max = arr[i];
                min = arr[i];
            }

            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println((sum - max) + " " + (sum - min));
    }
}
