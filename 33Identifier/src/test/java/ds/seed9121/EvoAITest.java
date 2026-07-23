package ds.seed9121;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import ds.Identifier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Tests for Identifier behavior (REQ-IDENT-001).
 *
 * These tests follow a simple Given-When-Then structure, include descriptive
 * assertion messages, and verify deterministic behavior across repeated calls.
 *
 * Note: This class improves the originally generated tests by making
 * assertions more descriptive and by checking repeatability and basic
 * boundary/error scenarios.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Identifier_ESTest_scaffolding {

    private Identifier identifier;

    @Before
    public void setUp() {
        // Given a fresh Identifier instance for each test
        identifier = new Identifier();
        assertNotNull("Setup must produce a non-null Identifier instance", identifier);
    }

    /**
     * REQ-IDENT-001
     * Given a non-alphanumeric character '!' when checking if it is valid as a
     * subsequent identifier character, then the result should be false and
     * repeated calls should be deterministic.
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        char input = '!';

        // When
        boolean first = identifier.valid_f(input);
        boolean second = identifier.valid_f(input);

        // Then
        assertFalse("REQ-IDENT-001: '!' should NOT be valid as a subsequent identifier character", first);
        assertEquals("Multiple invocations with the same input must be deterministic", first, second);
    }

    /**
     * REQ-IDENT-001
     * Given a starting-character candidate '{' when checking validity as a start
     * of an identifier, then it should be rejected and be deterministic.
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        char input = '{';

        // When
        boolean first = identifier.valid_s(input);
        boolean second = identifier.valid_s(input);

        // Then
        assertFalse("REQ-IDENT-001: '{' should NOT be valid as the starting character of an identifier", first);
        assertEquals("valid_s must return the same result on repeated calls", first, second);
    }

    /**
     * REQ-IDENT-001
     * Given a letter 'L' when checking validity as a start character, it should
     * be accepted and the result should be repeatable.
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        char input = 'L';

        // When
        boolean first = identifier.valid_s(input);
        boolean second = identifier.valid_s(input);

        // Then
        assertTrue("REQ-IDENT-001: 'L' is expected to be valid as the starting character of an identifier", first);
        assertEquals("valid_s must be consistent across invocations for the same input", first, second);
    }

    /**
     * REQ-IDENT-001
     * Given a complex string with invalid characters, validateIdentifier should
     * return false and behave deterministically.
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given
        String candidate = "6S389:`G";

        // When
        boolean first = identifier.validateIdentifier(candidate);
        boolean second = identifier.validateIdentifier(candidate);

        // Then
        assertFalse("REQ-IDENT-001: Strings beginning with invalid start characters or containing invalid punctuation should be rejected", first);
        assertEquals("validateIdentifier must return consistent results on repeated calls", first, second);
    }

    /**
     * REQ-IDENT-001
     * Given a string containing an internal illegal character '*', the identifier
     * validator should reject it and be deterministic.
     */
    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given
        String candidate = "ggYLD*";

        // When
        boolean first = identifier.validateIdentifier(candidate);
        boolean second = identifier.validateIdentifier(candidate);

        // Then
        assertFalse("REQ-IDENT-001: 'ggYLD*' contains an illegal character and should be invalid", first);
        assertEquals("validateIdentifier must be deterministic for identical inputs", first, second);
    }

    /**
     * REQ-IDENT-001
     * Given a minimal valid identifier 'i', the validator should accept it and
     * repeated invocations should remain consistent.
     */
    @Test(timeout = 4000)
    public void test5() throws Throwable {
        // Given
        String candidate = "i";

        // When
        boolean first = identifier.validateIdentifier(candidate);
        boolean second = identifier.validateIdentifier(candidate);

        // Then
        assertTrue("REQ-IDENT-001: Single-letter identifier 'i' should be valid", first);
        assertEquals("validateIdentifier must return the same boolean on repeated calls", first, second);
    }

    /**
     * REQ-IDENT-001
     * Given a string with multiple illegal characters, the validator should
     * reject it and be consistent across calls.
     */
    @Test(timeout = 4000)
    public void test6() throws Throwable {
        // Given
        String candidate = "dc}=5XIyS";

        // When
        boolean first = identifier.validateIdentifier(candidate);
        boolean second = identifier.validateIdentifier(candidate);

        // Then
        assertFalse("REQ-IDENT-001: 'dc}=5XIyS' contains illegal characters and should be invalid", first);
        assertEquals("validateIdentifier results must be repeatable", first, second);
    }

    /**
     * REQ-IDENT-001
     * Given a null input, the validator must gracefully return false (not throw)
     * and do so deterministically.
     */
    @Test(timeout = 4000)
    public void test7() throws Throwable {
        // Given
        String candidate = null;

        // When
        boolean first = identifier.validateIdentifier(candidate);
        boolean second = identifier.validateIdentifier(candidate);

        // Then
        assertFalse("REQ-IDENT-001: null input must be considered invalid and should not throw an exception", first);
        assertEquals("validateIdentifier must consistently handle null inputs", first, second);
    }
}