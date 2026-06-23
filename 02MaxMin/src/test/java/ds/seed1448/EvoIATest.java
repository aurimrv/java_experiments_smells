package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin1;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends MaxMin1_ESTest_scaffolding {

    private static final int[] ARRAY_LENGTH_7 = new int[7];
    private static final int[] ARRAY_LENGTH_4 = new int[4];

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        int[] intArray0 = ARRAY_LENGTH_7.clone();
        intArray0[4] = -1630;
        try {
            MaxMin1.maxMin1(intArray0, 1585);
            fail("Expecting ArrayIndexOutOfBoundsException due to invalid index 1585");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertEquals("Index 1585 out of bounds for length 7", e.getMessage());
            verifyException("ds.MaxMin1", e);
        }
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        int[] intArray0 = ARRAY_LENGTH_7.clone();
        intArray0[1] = 1585;
        try {
            MaxMin1.maxMin1(intArray0, 1585);
            fail("Expecting ArrayIndexOutOfBoundsException due to invalid index 1585");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertEquals("Index 1585 out of bounds for length 7", e.getMessage());
            verifyException("ds.MaxMin1", e);
        }
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        int[] intArray0 = ARRAY_LENGTH_4.clone();
        int[] intArray1 = MaxMin1.maxMin1(intArray0, 0);
        assertEquals("Returned array length should be 2", 2, intArray1.length);
        assertNotNull("Returned array should not be null", intArray1);
        // Additional assertions could verify contents if known
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        MaxMin1 maxMin1_0 = new MaxMin1();
        assertNotNull("Instance should be created", maxMin1_0);
    }

}