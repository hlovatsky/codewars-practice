package six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CamelCaseConverterTest {
    CamelCaseConverter converter = new CamelCaseConverter();

    @Test
    void testConverterToCamelCase() {
        assertEquals("theStealthWarrior", converter.convertToCamelCase("the-stealth-warrior"));
        assertEquals("TheStealthWarrior", converter.convertToCamelCase("The_Stealth_Warrior"));
        assertEquals("TheStealthWarrior", converter.convertToCamelCase("The_Stealth-Warrior"));
    }
}
