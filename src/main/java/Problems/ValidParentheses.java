package Problems;

public class ValidParentheses {
    public static void main(String[] args) {

    }

    public boolean isValid(String s) {
        int resultOne = 0, resultTwo = 0, resultThree = 0;

        for (int i = 0; i < s.length(); i++) {
            char chars = s.charAt(i);

            switch (chars) {
                case '(':
                    resultOne++;
                    break;
                case '{':
                    resultTwo++;
                    break;
                case '[':
                    resultThree++;
                    break;
                case ')':
                    resultOne--;
                    break;
                case '}':
                    resultTwo--;
                    break;
                case ']':
                    resultThree--;
                    break;
            }
        }
        return (resultOne == 0 && resultTwo == 0 && resultThree == 0);
    }
}
