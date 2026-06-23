package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.MaxMin4;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends MaxMin4_ESTest_scaffolding {

    /**
     * Test that maxMin4 throws ArrayIndexOutOfBoundsException when indices are out of bounds
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        int[] intArray0 = new int[9];
        intArray0[2] = 818;
        intArray0[3] = 1149;
        try {
            MaxMin4.maxMin4(intArray0, 0, 3167);
            fail("Expected ArrayIndexOutOfBoundsException due to invalid indices");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertNotNull("Exception should not be null", e);
        }
    }

    /**
     * Test that creating an instance of MaxMin4 does not throw exception
     */

}