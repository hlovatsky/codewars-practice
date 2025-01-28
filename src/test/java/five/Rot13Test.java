package five;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Rot13Test {
    Rot13 rot13 = new Rot13();

    @Test
    void testRot13() {
       assertEquals("RKNZCYR", rot13.replaceExpression("EXAMPLE"));
       assertEquals("RKN ZCYR", rot13.replaceExpression("EXA MPLE"));
       assertEquals("RKN.ZCYR!", rot13.replaceExpression("EXA.MPLE!"));
    }
}
