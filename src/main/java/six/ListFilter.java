package six;

import java.util.*;

/*
https://www.codewars.com/kata/525f50e3b73515a6db000b83
 */
public class ListFilter {

    public List<Object> filterInteger(List<Object> list) {
        return list.stream()
                .filter(Integer.class::isInstance)
                .toList();
    }
}