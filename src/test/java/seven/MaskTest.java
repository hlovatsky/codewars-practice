package seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
https://www.codewars.com/kata/5412509bd436bd33920011bc
 */

class MaskTest {

    Mask mask = new Mask();

    @Test
    void testMask() {
        assertEquals("############5616",mask.maskify("4556364607935616"));
        assertEquals("",mask.maskify(""));
        assertEquals("1",mask.maskify("1"));
    }
}
