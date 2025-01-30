package six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static six.LikeCount.messageFunction;

class LikeCountTest {

    @Test
    void testLikeCountWithoutLikes() {
        var names = new String[]{};
        assertEquals("no one likes this", messageFunction.apply(names));
    }

    @Test
    void testLikeCountWithOneLike() {
        var names = new String[]{"Peter"};
        assertEquals(names[0] + " likes this", messageFunction.apply(names));
    }

    @Test
    void testLikeCountWithTwoLikes() {
        var names = new String[]{"Jacob", "Alex"};
        assertEquals(names[0] + " and " + names[1] + " like this", messageFunction.apply(names));
    }

    @Test
    void testLikeCountWithThreeLikes() {
        var names = new String[]{"Max", "John", "Mark"};
        assertEquals(names[0] + ", " + names[1] + " and " + names[2] + " like this", messageFunction.apply(names));
    }

    @Test
    void testLikeCountWithFourLikes() {
        var names = new String[]{"Alex", "Jacob", "Mark", "Max"};
        assertEquals(names[0] + ", " + names[1] + " and " + 2 + " others like this", messageFunction.apply(names));
    }
}
