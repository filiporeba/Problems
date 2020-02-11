package Problems;

public class AppleAndOrange {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int place = 0;
        int app = 0;
        int org = 0;
        for (int i = 0; i < apples.length; i++) {
            place = apples[i] + a;
            if(place >= s && place <= t)
                app++;
        }
        place = 0;
        for (int i = 0; i < oranges.length; i++) {
            place = oranges[i] + b;
            if(place >= s && place <= t)
                org++;
        }
        System.out.println(app);
        System.out.println(org);
    }
}
