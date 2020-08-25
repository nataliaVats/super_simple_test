package tests;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;


@Tag("simple_tests")
public class ParametrizedTests {
    static Logger logger = LoggerFactory.getLogger(ParametrizedTests.class);

    @Test
    @Tag("apple_tag")
    void parametrizedStringTest() {
        String b = System.getProperty("bbb"); // from terminal, gradle apple_tests  -Dbbb = apple

        assertEquals("apple", b, "b = " + b );
    }

}
