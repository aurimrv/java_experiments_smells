package ds.seed5831;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import ds.Fibonacci;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Tests for Fibonacci (REQ-001).
 * Improved to include clearer assertions, setup/teardown hooks, and traceability.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Fibonacci_ESTest_scaffolding {

    private static final int INPUT = 3285;
    private static final int EXPECTED = 317802690;

    @Before
    public void setUp() {
        // Prepare test environment if necessary (kept minimal to preserve independence)
    }

    @After
    public void tearDown() {
        // Cleanup resources if necessary
    }

    /**
     * Tests REQ-001: fibIter returns expected value for a large input.
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        final int input = INPUT;
        final int expected = EXPECTED;
        // When
        int result = Fibonacci.fibIter(input);
        // Then
        assertEquals("fibIter should return expected value", expected, result);
        assertTrue("Result should be non-negative", result >= 0);
    }

    /**
     * Tests REQ-001: constructing Fibonacci instance succeeds.
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given / When
        Fibonacci fibonacci0 = new Fibonacci();
        // Then
        assertNotNull("Fibonacci instance should be created", fibonacci0);
    }
}