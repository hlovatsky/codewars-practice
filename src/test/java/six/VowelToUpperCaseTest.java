package six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VowelToUpperCaseTest {

    VowelToUpperCase toUpperCase = new VowelToUpperCase();

    @Test
    void testArrayPlusOne() {
        assertEquals("HEllO WOrld!", toUpperCase.replaceVowelsToUpperCase("Hello World!"));
    }
}