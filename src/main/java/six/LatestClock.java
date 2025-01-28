package six;

import java.util.HashSet;
import java.util.Set;

/*
https://www.codewars.com/kata/58925dcb71f43f30cd00005f
 */
public class LatestClock {

    public String getLatestTime(Integer... integers) {
        return getTime(23, integers) + ":" + getTime(59, integers);
    }

    private int getTime(int possibleMaxValue, Integer... integers) {
        Set<String> timeList = new HashSet<>();
        int time;
        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers.length; j++) {
                if (i != j) {
                    var twoDigitsNumber = integers[i].toString() + integers[j].toString();
                    timeList.add(twoDigitsNumber);
                }
            }
        }
        var maxValueFromSet = timeList.stream()
                .mapToInt(Integer::parseInt)
                .filter(s -> s >= 0 && s <= possibleMaxValue)
                .max();

        if (maxValueFromSet.isPresent()) {
            time = maxValueFromSet.getAsInt();
        } else {
            return -1;
        }
        return time;
    }
}
