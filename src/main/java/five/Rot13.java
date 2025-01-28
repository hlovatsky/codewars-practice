package five;

import java.util.*;
import java.util.stream.Collectors;

public class Rot13 {

    public String replaceExpression(String expression) {
        List<Character> charList = expression.chars()
                .mapToObj(c -> (char) c)
                .toList();
        List<Character> replacedList = new ArrayList<>();
        for (Character symbol : charList) {
            var index = findIndex(symbol);
            if (index != -1) {
                var halfOfList = getAlphabet().size() / 2;
                if (index <= halfOfList) {
                    symbol = findValue(index + halfOfList);
                } else {
                    symbol = findValue(index - halfOfList);
                }
            }
            replacedList.add(symbol);
        }
        return replacedList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    private int findIndex(char value) {
        return getAlphabet().indexOf(value);
    }

    private char findValue(int index) {
        return getAlphabet().get(index);
    }

    private List<Character> getAlphabet() {
        List<Character> alphabet = new ArrayList<>();
        alphabet.add('A');
        alphabet.add('B');
        alphabet.add('C');
        alphabet.add('D');
        alphabet.add('E');
        alphabet.add('F');
        alphabet.add('G');
        alphabet.add('H');
        alphabet.add('I');
        alphabet.add('J');
        alphabet.add('K');
        alphabet.add('L');
        alphabet.add('M');
        alphabet.add('N');
        alphabet.add('O');
        alphabet.add('P');
        alphabet.add('Q');
        alphabet.add('R');
        alphabet.add('S');
        alphabet.add('T');
        alphabet.add('U');
        alphabet.add('V');
        alphabet.add('W');
        alphabet.add('X');
        alphabet.add('Y');
        alphabet.add('Z');
        return alphabet;
    }
}
