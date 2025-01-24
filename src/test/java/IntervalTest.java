import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntervalTest {
    Interval interval = new Interval();

    @Test
    void testIntervalFunction() {
        int[] firstArray = {3, 6};
        int[] secondArray = {5, 6};
        int[] thirdArray = {1, 5};

        var expected = 8;
        var actual = interval.sumInterval(firstArray, secondArray, thirdArray);
        assertEquals(expected, actual);
    }
}
