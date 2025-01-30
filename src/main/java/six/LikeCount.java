package six;

import java.util.function.Function;

/*
https://www.codewars.com/kata/5266876b8f4bf2da9b000362
 */

public class LikeCount {

    private LikeCount() {
    }

    public static final Function<String[], String> messageFunction = names -> {
        switch (names.length) {
            case 0:
                return "no one likes this";
            case 1:
                return names[0] + " likes this";
            case 2:
                return names[0] + " and " + names[1] + " like this";
            case 3:
                return names[0] + ", " + names[1] + " and " + names[2] + " like this";
            default:
                int count = names.length - 2;
                return names[0] + ", " + names[1] + " and " + count + " others like this";
        }
    };
}