package six;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharCountTest {

    CharCount count = new CharCount();

    @Test
    void testCharCount() {
        var expectedResult = Map.of('a', 2L, 'b',1L);
        var actualResult = count.getCharCount("aba");
        assertEquals(expectedResult, actualResult);

        var expectedResultLongString = Map.of('a', 2L, 'b',3L, 'c', 4L, 'd', 3L);
        var actualResultLongString = count.getCharCount("ababbccccddd");
        assertEquals(expectedResultLongString, actualResultLongString);

        var expectedResultWithEmpty = Map.of();
        var actualResultWithEmpty = count.getCharCount("");
        assertEquals(expectedResultWithEmpty, actualResultWithEmpty);
    }
}
