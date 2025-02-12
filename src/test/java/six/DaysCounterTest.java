package six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DaysCounterTest {

    DaysCounter counter = new DaysCounter();

    @Test
    void testDaysCounter() {
        assertEquals(5021L, counter.getDaysBetween2Dates("1987-01-16", "2000-10-15"));
    }
}