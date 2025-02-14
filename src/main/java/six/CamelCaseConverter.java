package six;

public class CamelCaseConverter {

    public String convertToCamelCase(String word) {
        var words = word.split("[-_]");
        StringBuilder stringBuilder = new StringBuilder(words[0]);
        for (int i = 1; i < words.length; i++) {
           stringBuilder.append(Character.toUpperCase(words[i].charAt(0)));
           stringBuilder.append(words[i].substring(1));
        }
        return stringBuilder.toString();
    }
}
