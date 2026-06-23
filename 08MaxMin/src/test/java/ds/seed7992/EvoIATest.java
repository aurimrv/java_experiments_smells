package ds.seed7992;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.MaxMin4;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends MaxMin4_ESTest_scaffolding {

    private int[] createTestArray() {
        int[] arr = new int[6];
        return arr;
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        int[] intArray0 = createTestArray();
        intArray0[3] = -1;
        try {
            MaxMin4.maxMin4(intArray0, 0, 2598);
            fail("Expected ArrayIndexOutOfBoundsException to be thrown due to invalid index");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertNull("Exception message should be null", e.getMessage());
        }
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        int[] intArray0 = createTestArray();
        intArray0[1] = 2598;
        try {
            MaxMin4.maxMin4(intArray0, 0, 2598);
            fail("Expected ArrayIndexOutOfBoundsException to be thrown due to invalid index");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertNull("Exception message should be null", e.getMessage());
        }
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        MaxMin4 maxMin4_0 = new MaxMin4();
        assertNotNull("Instance should not be null", maxMin4_0);
    }

}