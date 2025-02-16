package five;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstNonRepeatingLetterTest {

    FirstNonRepeatingLetter firstNonRepeatingLetter = new FirstNonRepeatingLetter();

    @Test
    void testFirstNonRepeatingLetter() {
        assertEquals('t', firstNonRepeatingLetter.firstNonRepeatingLetter("stress"));
    }
}
