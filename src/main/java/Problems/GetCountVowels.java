package Problems;

public class GetCountVowels {
    public static void main(String[] args) {
        System.out.println(getCount("vowelstocount"));
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] words = str.toLowerCase().toCharArray();

        for (int i = 0; i < words.length; i++) {
            if (words[i] == 'a' || words[i] == 'e' || words[i] == 'i' || words[i] == 'u' || words[i] == 'o') {
                vowelsCount++;
            }
        }

        return vowelsCount;
    }
}
