package six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DuplicatesRemoverTest {

    DuplicatesRemover remover = new DuplicatesRemover();

    @Test
    void testDuplicatesRemover() {
        var expectedResult = new String[]{"abracadabra", "alote", "asese"};
        var actualResult = new String[]{"abracadabra", "allottee", "assessee"};
        assertArrayEquals(expectedResult, remover.removedDuplicatesInEachString(actualResult));
    }
}