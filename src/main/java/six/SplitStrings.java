package six;

import java.util.ArrayList;
import java.util.List;

/*
https://www.codewars.com/kata/515de9ae9dcfc28eb6000001
 */

public class SplitStrings {

    public List<String> split(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);
        List<String> pairs = new ArrayList<>();

        if (stringBuilder.length() % 2 == 1) {
            stringBuilder.append("_");
        }

        for (int i = 0; i < stringBuilder.length(); i += 2) {
            pairs.add(stringBuilder.substring(i, i + 2));
        }
        return pairs;
    }
}
