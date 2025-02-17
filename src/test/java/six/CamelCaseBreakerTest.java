package six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CamelCaseBreakerTest {

    CamelCaseBreaker camelCaseBreaker = new CamelCaseBreaker();

    @Test
    void testCamelCaseBreaker() {
        assertEquals("camel Casing",  camelCaseBreaker.removeCamelCasing("camelCasing"));
        assertEquals("identifier",  camelCaseBreaker.removeCamelCasing("identifier"));
        assertEquals("",  camelCaseBreaker.removeCamelCasing(""));
    }
}
