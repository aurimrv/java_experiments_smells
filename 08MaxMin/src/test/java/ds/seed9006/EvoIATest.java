package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin4;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends MaxMin4_ESTest_scaffolding {

    private int[] createTestArray0() {
        int[] arr = new int[6];
        arr[2] = -3009;
        return arr;
    }

    private int[] createTestArray1() {
        int[] arr = new int[6];
        arr[1] = 1;
        return arr;
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        int[] intArray0 = createTestArray0();
        try {
            MaxMin4.maxMin4(intArray0, 0, 1442);
            fail("Expected ArrayIndexOutOfBoundsException due to invalid indices");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertNotNull("Exception message should not be null", e.getMessage());
        }
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        int[] intArray0 = createTestArray1();
        try {
            MaxMin4.maxMin4(intArray0, 0, 1442);
            fail("Expected ArrayIndexOutOfBoundsException due to invalid indices");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertNotNull("Exception message should not be null", e.getMessage());
        }
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        MaxMin4 maxMin4_0 = new MaxMin4();
        int[] testArray = {1, 2, 3, 4};
        int[] result = MaxMin4.maxMin4(testArray, 0, 3);
        assertNotNull("Result should not be null", result);
        assertEquals("Result length should be 4", 4, result.length);
    }
}