package six;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SplitStringsTest {

    SplitStrings splitStrings = new SplitStrings();

    @Test
    void testSplitStrings() {
        assertEquals(List.of("ab", "c_"), splitStrings.split("abc"));
    }
}
