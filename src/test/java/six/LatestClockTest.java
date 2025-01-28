package six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LatestClockTest {

    LatestClock clock = new LatestClock();

    @Test
    void testLatestClockPositive() {
        var actualResult = clock.getLatestTime(9, 1, 2, 5);
        assertEquals("21:59", actualResult);
    }

    @Test
    void testLatestClockNegative() {
        var actualResult = clock.getLatestTime(9, 9, 9, 9);
        assertEquals("-1:-1", actualResult);
    }

    @Test
    void testLatestClockWithBoundaryValuePositive() {
        var actualResult = clock.getLatestTime(9, 3, 2, 5);
        assertEquals("23:59", actualResult);
    }

    @Test
    void testLatestClockWithBoundaryValueNegative() {
        var actualResult = clock.getLatestTime(0, 4, 2, 6);
        assertNotEquals("24:60", actualResult);
        assertEquals("20:46", actualResult);
    }
}