package ds.seed5838;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Identifier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends Identifier_ESTest_scaffolding {

    private Identifier createIdentifier() {
        return new Identifier();
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Identifier identifier0 = createIdentifier();
        boolean boolean0 = identifier0.valid_f('(');
        assertFalse("Character '(' should be invalid", boolean0);
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Identifier identifier0 = createIdentifier();
        boolean boolean0 = identifier0.validateIdentifier("p");
        assertTrue("Expected 'p' to be a valid identifier", boolean0);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Identifier identifier0 = createIdentifier();
        boolean boolean0 = identifier0.validateIdentifier("&L_|vCW:e|7`");
        assertFalse("Expected invalid identifier for string '&L_|vCW:e|7`'", boolean0);
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        Identifier identifier0 = createIdentifier();
        boolean boolean0 = identifier0.validateIdentifier("|");
        assertFalse("Expected invalid identifier for string '|'", boolean0);
    }

    @Test(timeout = 4000)
    public void test4() throws Throwable {
        Identifier identifier0 = createIdentifier();
        boolean boolean0 = identifier0.validateIdentifier("I7SVNqA");
        assertFalse("Expected invalid identifier for string 'I7SVNqA'", boolean0);
    }

    @Test(timeout = 4000)
    public void test5() throws Throwable {
        Identifier identifier0 = createIdentifier();
        boolean boolean0 = identifier0.validateIdentifier(null);
        assertFalse("Expected false for null identifier input", boolean0);
    }
}