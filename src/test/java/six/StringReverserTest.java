package six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringReverserTest {

    StringReverser reverser = new StringReverser();

    @Test
    void testStringReverser() {
        assertEquals("Hey fellow warriors", reverser.revertWordWithMoreThenFourChars("Hey wollef sroirraw"));
        assertEquals("This is a test", reverser.revertWordWithMoreThenFourChars("This is a test"));
        assertEquals("This is another test", reverser.revertWordWithMoreThenFourChars("This is rehtona test"));
    }
}