package eight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindHighAndLowNumbersTest {
    FindHighAndLowNumbers find = new FindHighAndLowNumbers();

    @Test
    void testFindHighAndLowNumbers() {
        assertEquals("5 1", find.highAndLow("1 2 3 4 5"));
        assertEquals("5 -3", find.highAndLow("1 2 -3 4 5"));
        assertEquals("9 -5", find.highAndLow("1 9 3 4 -5"));
        assertEquals("Min and max values are equal", find.highAndLow("1 1 1 1 1"));
    }
}