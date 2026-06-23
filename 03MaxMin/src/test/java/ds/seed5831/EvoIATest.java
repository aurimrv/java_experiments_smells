package ds.seed5831;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.MaxMin2;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends MaxMin2_ESTest_scaffolding {

    private void expectArrayIndexOutOfBounds(int[] array, int index) {
        try {
            MaxMin2.maxMin2(array, index);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        int[] intArray0 = new int[7];
        intArray0[1] = -377;
        expectArrayIndexOutOfBounds(intArray0, 314);
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        int[] intArray0 = new int[7];
        intArray0[2] = 5420;
        expectArrayIndexOutOfBounds(intArray0, 314);
    }

    private static final int EXPECTED_LENGTH = 2;

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        int[] intArray0 = new int[5];
        int[] intArray1 = MaxMin2.maxMin2(intArray0, 0);
        assertEquals("Returned array length should be " + EXPECTED_LENGTH, EXPECTED_LENGTH, intArray1.length);
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        MaxMin2 maxMin2_0 = new MaxMin2();
        assertNotNull("MaxMin2 instance should not be null", maxMin2_0);
    }
}