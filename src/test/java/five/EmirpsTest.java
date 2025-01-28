package five;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmirpsTest {

    Emirps emirps = new Emirps();

    @Test
    void testEmirpsPositive() {
        long[] actual = emirps.findEmirp(50);
        long[] expected = {4, 37, 98};
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    void testEmirpsNegative() {
        long[] actual = emirps.findEmirp(10);
        long[] expected = {0, 0, 0};
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}
