package ds.seed1448;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import ds.Fibonacci;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Fibonacci_ESTest_scaffolding {

    private static final int INPUT = 2322;
    private static final int EXPECTED_FIB_2322 = -1595386344;

    private Fibonacci fibonacci;

    @Before
    public void setUp() {
        // Per-test initialization to ensure independence
        this.fibonacci = createFibonacci();
    }

    @After
    public void tearDown() {
        // Clean up references to avoid leaks and side effects
        this.fibonacci = null;
    }

    // Helper to centralize construction
    private Fibonacci createFibonacci() {
        return new Fibonacci();
    }

    /**
     * Tests REQ-FIB-001: Verify Fibonacci iterative computation for a large index.
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        int input = INPUT;
        // When
        int result = Fibonacci.fibIter(input);
        // Then: verify expected value and determinism
        assertEquals("REQ-FIB-001: fibIter should return the expected value for input " + input, EXPECTED_FIB_2322, result);
        // Extra assertion to improve fault detection (consistency check)
        assertEquals("fibIter should be deterministic across repeated calls", result, Fibonacci.fibIter(input));
    }

    /**
     * Tests REQ-FIB-INIT-001: Verify Fibonacci construction.
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given-When: construct a Fibonacci instance
        Fibonacci fibonacci0 = createFibonacci();
        // Then: ensure the constructor produced a usable object
        assertNotNull("REQ-FIB-INIT-001: constructor should create a non-null Fibonacci instance", fibonacci0);
    }
}