package six;

import java.util.*;
import java.util.stream.Collectors;

/*
 https://www.codewars.com/kata/52efefcbcdf57161d4000091
  */
public class CharCount {

    public Map<Character, Long> getCharCount(String word) {
        return word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Character::charValue,
                        Collectors.counting()));

    }
}