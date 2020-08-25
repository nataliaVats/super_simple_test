package tests;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("more_simple_tests")
public class MoreSimpleTests {

    @Test
    void superPositiveTest() {
        assertEquals(3, 3);
    }

    @Tag("not_you")
    @Test
    void superNegativeTest() {
        assertEquals(2, 3);
    }
}
