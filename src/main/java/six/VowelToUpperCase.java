package six;

public class VowelToUpperCase {

    public String replaceVowelsToUpperCase(String expression) {
        var charArray = expression.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();
        for (char c : charArray) {
            if (isVowel(c)) {
                stringBuilder.append(Character.toUpperCase(c));
            }
            else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
