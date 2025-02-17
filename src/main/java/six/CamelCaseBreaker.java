package six;

/*
https://www.codewars.com/kata/5208f99aee097e6552000148
 */
public class CamelCaseBreaker {

    public String removeCamelCasing(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            var c = word.charAt(i);
            if (Character.isUpperCase(c)) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}