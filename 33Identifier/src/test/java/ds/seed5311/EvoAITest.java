package ds.seed5311;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import ds.Identifier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

public class EvoAITest {

    private Identifier identifier;

    @Before
    public void setUp() {
        identifier = new Identifier();
        assertNotNull("Identifier instance should be created", identifier);
    }

    @Test(timeout = 4000)
    public void test0() throws Exception {
        String input = "H^>F2'Be,.V${9!d";
        boolean result = identifier.validateIdentifier(input);
        assertFalse("Expected invalid identifier for input with special characters: " + input, result);
    }

    @Test(timeout = 4000)
    public void test1() throws Exception {
        char c = '~';
        boolean result = identifier.valid_s(c);
        assertFalse("Expected valid_s to return false for character: " + c, result);
    }

    @Test(timeout = 4000)
    public void test2() throws Exception {
        String input = "sluUOAEo2iL";
        boolean result = identifier.validateIdentifier(input);
        assertFalse("Expected invalid identifier for mixed-case alphanumeric string: " + input, result);
    }

    @Test(timeout = 4000)
    public void test3() throws Exception {
        String input = "8(9>3";
        boolean result = identifier.validateIdentifier(input);
        assertFalse("Expected invalid identifier for input containing parentheses/greater-than: " + input, result);
    }

    @Test(timeout = 4000)
    public void test4() throws Exception {
        String input = "Z";
        boolean result = identifier.validateIdentifier(input);
        assertTrue("Expected single uppercase letter to be a valid identifier: " + input, result);
    }

    @Test(timeout = 4000)
    public void test5() throws Exception {
        String input = null;
        boolean result = identifier.validateIdentifier(input);
        assertFalse("Expected null input to be treated as invalid identifier", result);
    }
}