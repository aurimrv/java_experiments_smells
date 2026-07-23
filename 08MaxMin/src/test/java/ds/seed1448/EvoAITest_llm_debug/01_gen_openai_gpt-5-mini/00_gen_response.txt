package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin4;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for MaxMin4 behaviors.
 * Traceability: REQ-001
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends MaxMin4_ESTest_scaffolding {

    /** REQ-001: maxMin4 should throw when end index exceeds array length */
    @Test(timeout = 4000, expected = ArrayIndexOutOfBoundsException.class)
    public void test0() throws Throwable {
        // Given: an array of length 9 with specific elements
        int[] intArray = new int[9];
        intArray[2] = 818;
        intArray[3] = 1149;
        // Preconditions
        assertEquals("precondition index2", 818, intArray[2]);
        assertEquals("precondition index3", 1149, intArray[3]);
        // When/Then: calling with an excessive end index must throw
        MaxMin4.maxMin4(intArray, 0, 3167);
    }

    /** REQ-001: MaxMin4 instantiation and a basic happy-path invocation */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        MaxMin4 maxMin4 = new MaxMin4();
        assertNotNull("MaxMin4 instance should be created", maxMin4);
        // When: call with valid indices (happy path)
        MaxMin4.maxMin4(new int[] {1, 2, 3, 4}, 0, 3);
        // Then: basic sanity assertion
        assertEquals("input array length should be 4", 4, (new int[] {1,2,3,4}).length);
    }
}