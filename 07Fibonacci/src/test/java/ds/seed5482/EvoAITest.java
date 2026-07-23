package ds.seed5482;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import ds.Fibonacci;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Tests REQ-001: Fibonacci behavior (hand-maintained improvements).
 * This class EvoAITest the original test methods and improves clarity, assertions,
 * and categorization while retaining original intent and coverage.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Fibonacci_ESTest_scaffolding {

    private static final int LARGE_INDEX = 1596;
    private static final int EXPECTED_FOR_LARGE_INDEX = 1597594320;

    @Before
    public void setUp() {
        // No shared mutable state to reset, present for future-proofing and clarity
    }

    @After
    public void tearDown() {
        // No resources to clean up; placeholder for consistency
    }

    @Test(timeout = 4000)
    public void test0()  throws Throwable  {
        // Given
        final int input = LARGE_INDEX;
        // When
        int result = Fibonacci.fibIter(input);
        // Then
        assertEquals("fibIter should return expected value for a large index", EXPECTED_FOR_LARGE_INDEX, result);
        // Additional lightweight checks to increase fault-detection
        assertTrue("Result should be non-negative", result >= 0);
    }

    @Test(timeout = 4000)
    public void test1()  throws Throwable  {
        // Given-When-Then: constructor should create a usable instance
        Fibonacci fibonacci0 = new Fibonacci();
        assertNotNull("Constructor should create a Fibonacci instance", fibonacci0);
    }
}