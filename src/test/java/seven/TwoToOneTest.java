package seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
https://www.codewars.com/kata/5656b6906de340bd1b0000ac
 */
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
