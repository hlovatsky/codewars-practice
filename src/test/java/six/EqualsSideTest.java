package six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EqualsSideTest {

    EqualSide equalSide = new EqualSide();

    @Test
    void testEqualSide() {
        assertEquals(3, equalSide.getOutlierByForLoop(new int[]{1, 2, 3, 4, 3, 2, 1}));
        assertEquals(1, equalSide.getOutlierByForLoop(new int[]{1, 100, 50, -51, 1, 1}));
        assertEquals(-1, equalSide.getOutlierByForLoop(new int[]{100, 50, -51, 1, 1}));
    }
}
