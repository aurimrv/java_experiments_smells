package ds.seed9121;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.experimental.categories.Category;
import ds.Fibonacci;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Fibonacci_ESTest_scaffolding {

    // Constants to avoid magic numbers and improve readability
    private static final int TEST_INPUT = 699;
    private static final int EXPECTED_VALUE = 1805420098;

    @Before
    public void setUp() {
        // setup if required in future; kept empty to emphasize test independence
    }

    @After
    public void tearDown() {
        // cleanup if required; no-op to avoid side effects
    }

    /**
     * Given-When-Then: Verify fibIter for a representative input (REQ-FIB-001).
     * Given input 699
     * When computing Fibonacci.fibIter(699)
     * Then the returned value should equal the expected integer and be positive
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        final int input = TEST_INPUT;
        // When
        int result = Fibonacci.fibIter(input);
        // Then: multiple assertions to improve fault detection
        assertTrue("fibIter(" + input + ") should return a positive value", result > 0);
        assertEquals("fibIter(" + input + ") did not return expected value", EXPECTED_VALUE, result);
    }

    /**
     * Given-When-Then: Verify error handling for invalid negative input (REQ-FIB-002).
     * Given a negative input
     * When computing Fibonacci.fibIter(-1)
     * Then an IllegalArgumentException is expected
     */
    @Test(expected = IllegalArgumentException.class, timeout = 4000)
    public void test1() throws Throwable {
        // Act: call with invalid input to verify exceptional flow
        Fibonacci.fibIter(-1);
    }
}