package ds.seed5831;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Identifier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends Identifier_ESTest_scaffolding {

    private static final char INVALID_CHAR_0 = '~';
    private static final char INVALID_CHAR_1 = '(';
    private static final String VALID_IDENTIFIER = "w";
    private static final String INVALID_IDENTIFIER_0 = "NC?{?nGl'@0z\u0002M%_";
    private static final String INVALID_IDENTIFIER_1 = "rjAn7dps";
    private static final String NULL_IDENTIFIER = null;

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Identifier identifier0 = new Identifier();
        boolean boolean0 = identifier0.valid_s(INVALID_CHAR_0);
        assertFalse("Character '~' should be invalid", boolean0);
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Identifier identifier0 = new Identifier();
        boolean boolean0 = identifier0.valid_s(INVALID_CHAR_1);
        assertFalse("Character '(' should be invalid", boolean0);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Identifier identifier0 = new Identifier();
        boolean boolean0 = identifier0.validateIdentifier(VALID_IDENTIFIER);
        assertTrue("Expected validateIdentifier to return true for 'w'", boolean0);
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        Identifier identifier0 = new Identifier();
        boolean boolean0 = identifier0.validateIdentifier(INVALID_IDENTIFIER_0);
        assertFalse("Expected validateIdentifier to return false for complex invalid string", boolean0);
    }

    @Test(timeout = 4000)
    public void test4() throws Throwable {
        Identifier identifier0 = new Identifier();
        boolean boolean0 = identifier0.validateIdentifier(INVALID_IDENTIFIER_1);
        assertFalse("Expected validateIdentifier to return false for 'rjAn7dps'", boolean0);
    }

    @Test(timeout = 4000)
    public void test5() throws Throwable {
        Identifier identifier0 = new Identifier();
        boolean boolean0 = identifier0.validateIdentifier(NULL_IDENTIFIER);
        assertFalse("Expected validateIdentifier to return false for null input", boolean0);
    }
}