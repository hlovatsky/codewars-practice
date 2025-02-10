package six;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
https://www.codewars.com/kata/5264d2b162488dc400000001
 */
public class StringReverser {

    public String revertWordWithMoreThenFourChars(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(word -> word.length() > 4 ? new StringBuilder(word).reverse().toString() : word)
                .collect(Collectors.joining(" "));
    }
}