package six;

import java.util.Arrays;

/*
https://www.codewars.com/kata/59f08f89a5e129c543000069
 */
public class DuplicatesRemover {

    public String[] removedDuplicatesInEachString(String[] content) {

        return Arrays.stream(content)
                .map(this::removeDuplicates)
                .toArray(String[]::new);
    }

    private String removeDuplicates(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        var charArray = word.toCharArray();
        var previousChar = 0;
        for (char currentChar : charArray) {
            if (currentChar != previousChar) {
                stringBuilder.append(currentChar);
                previousChar = currentChar;
            }
        }
        return stringBuilder.toString();
    }
}