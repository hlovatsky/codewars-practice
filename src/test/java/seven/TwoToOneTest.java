package seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoToOneTest {
    TwoToOne twoToOne = new TwoToOne();

    @Test
    void testSorting() {
        var a = "xyaabbbccccdefww";
        var b = "xxxxyyyyabklmopq";
        assertEquals("abcdefklmopqwxy", twoToOne.sorting(a, b));

        var c = "abcdefghijklmnopqrstuvwxyz";
        assertEquals("abcdefghijklmnopqrstuvwxyz", twoToOne.sorting(c, c));
    }
}
