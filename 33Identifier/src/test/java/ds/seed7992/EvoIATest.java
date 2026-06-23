package ds.seed7992;

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
        boolean boolean0 = identifier0.valid_f('0'); // boundary value example
        assertTrue("valid_f should return true for character '0'", boolean0);
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Identifier identifier0 = createIdentifier();
        boolean boolean0 = identifier0.valid_f(' '); // boundary value example (space)
        assertFalse("valid_f should return false for character ' '", boolean0);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Identifier identifier0 = createIdentifier();
        boolean boolean0 = identifier0.valid_s(' '); // boundary value example (space)
        assertFalse("valid_s should return false for character ' '", boolean0);
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        Identifier identifier0 = createIdentifier();
        boolean boolean0 = identifier0.valid_s('a'); // boundary value example
        assertTrue("valid_s should return true for character 'a'", boolean0);
    }

    @Test(timeout = 4000)
    public void test4() throws Throwable {
        Identifier identifier0 = createIdentifier();
        boolean boolean0 = identifier0.validateIdentifier(""); // boundary value example (empty string)
        assertFalse("validateIdentifier should return false for empty string", boolean0);
    }

    @Test(timeout = 4000)
    public void test5() throws Throwable {
        Identifier identifier0 = createIdentifier();
        boolean boolean0 = identifier0.validateIdentifier(""); // boundary value example (empty string)
        assertFalse("validateIdentifier should return false for empty string", boolean0);
    }

    @Test(timeout = 4000)
    public void test6() throws Throwable {
        Identifier identifier0 = createIdentifier();
        boolean boolean0 = identifier0.validateIdentifier(""); // boundary value example (empty string)
        assertFalse("validateIdentifier should return false for empty string", boolean0);
    }

    @Test(timeout = 4000)
    public void test7() throws Throwable {
        Identifier identifier0 = createIdentifier();
        boolean boolean0 = identifier0.validateIdentifier((String) null);
        assertFalse("validateIdentifier should return false for null input", boolean0);
    }
}