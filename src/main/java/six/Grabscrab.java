package six;

import java.util.*;

/*
https://www.codewars.com/kata/52b305bec65ea40fe90007a7
 */
public class Grabscrab {

    public List<String> getListOfMatchedWords(String input, String[] words) {
        List<String> list = new ArrayList<>();
        var charArray = input.toCharArray();
        Arrays.sort(charArray);
        var sortedInput = new String(charArray);
        for (String s : words) {
            var word = s.toCharArray();
            Arrays.sort(word);
            var sortedWord = new String(word);
            if (sortedInput.equals(sortedWord)) {
                list.add(s);
            }
        }
        return list;
    }
}