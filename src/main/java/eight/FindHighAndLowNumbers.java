package eight;

import java.util.Arrays;

/*
https://www.codewars.com/kata/554b4ac871d6813a03000035
 */

public class FindHighAndLowNumbers {

    public String highAndLow(String value) {
        var charList = value.split(" ");
        var maxValue = Arrays.stream(charList)
                .mapToInt(Integer::parseInt)
                .max();
        var minValue = Arrays.stream(charList)
                .mapToInt(Integer::parseInt)
                .min();
        if (maxValue.isPresent() && maxValue.getAsInt() != minValue.getAsInt()) {
            return maxValue.getAsInt() + " " + minValue.getAsInt();
        } else {
            return "Min and max values are equal";
        }
    }
}