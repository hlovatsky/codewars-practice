package seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GetMiddleCharTest {
    GetMiddleChar middleChar = new GetMiddleChar();

    @Test
    void testMiddleChar() {
        assertEquals("T", middleChar.getMidChar("T"));
        assertEquals("s", middleChar.getMidChar("Tests"));
        assertEquals("es", middleChar.getMidChar("Test"));
    }
}
