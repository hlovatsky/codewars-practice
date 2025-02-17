package six;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GrabscrabTest {
    Grabscrab grabscrab = new Grabscrab();

    @Test
    void testGrabscrab() {
        var matchedList = List.of("sport", "ports");
        assertEquals(matchedList, grabscrab.getListOfMatchedWords("ortsp", List.of("sport", "parrot", "ports", "matey")));

        var expectedResult= List.of();
        assertEquals(expectedResult, grabscrab.getListOfMatchedWords("ortspdfree", List.of("sport", "parrot", "ports", "matey")));
    }
}
