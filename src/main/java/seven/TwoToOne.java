package seven;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TwoToOne {

    public String sorting(String a, String b) {
        var s = a + b;
        var charArray = s.toCharArray();
        return IntStream.range(0, charArray.length)
                .mapToObj(i -> charArray[i])
                .distinct()
                .map(String::valueOf)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.joining());
    }
}
