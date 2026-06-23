package ds.seed5831;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin3;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends MaxMin3_ESTest_scaffolding {

    private void expectArrayIndexOutOfBounds(int[] arr, int index) {
        try {
            MaxMin3.maxMin3(arr, index);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            verifyException("ds.MaxMin3", e);
        }
    }

    private void expectNullPointerException(int[] arr, int index) {
        try {
            MaxMin3.maxMin3(arr, index);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            verifyException("ds.MaxMin3", e);
        }
    }

    /**
     * Test that maxMin3 throws ArrayIndexOutOfBoundsException when index is out of bounds
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        int[] intArray0 = new int[4];
        intArray0[0] = 0; // boundary min index
        intArray0[3] = 790; // boundary max index
        expectArrayIndexOutOfBounds(intArray0, 4); // just outside boundary
    }

    /**
     * Test that maxMin3 throws ArrayIndexOutOfBoundsException when index is out of bounds
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        int[] intArray0 = new int[5];
        intArray0[0] = 0; // boundary min index
        intArray0[4] = 100; // boundary max index
        expectArrayIndexOutOfBounds(intArray0, 5); // just outside boundary
    }

    /**
     * Test that maxMin3 throws ArrayIndexOutOfBoundsException when index is out of bounds
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        int[] intArray0 = new int[6];
        intArray0[0] = 0; // boundary min index
        intArray0[5] = -598; // boundary max index
        expectArrayIndexOutOfBounds(intArray0, 6); // just outside boundary
    }

    /**
     * Test that maxMin3 throws ArrayIndexOutOfBoundsException when index is out of bounds
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        int[] intArray0 = new int[6];
        intArray0[0] = 0; // boundary min index
        intArray0[5] = 100; // boundary max index
        expectArrayIndexOutOfBounds(intArray0, 6); // just outside boundary
    }

    /**
     * Test that maxMin3 throws NullPointerException when input array is null
     */
    @Test(timeout = 4000)
    public void test4() throws Throwable {
        expectNullPointerException(null, 1043);
    }

    /**
     * Test normal flow: returned array is a different instance
     */
    @Test(timeout = 4000)
    public void test5() throws Throwable {
        int[] intArray0 = new int[2];
        int[] intArray1 = MaxMin3.maxMin3(intArray0, -1);
        assertNotSame("Returned array should be a different instance", intArray1, intArray0);
        assertEquals("Returned array length should match input", intArray0.length, intArray1.length);
    }

    /**
     * Test object instantiation
     */
    @Test(timeout = 4000)
    public void test6() throws Throwable {
        MaxMin3 maxMin3_0 = new MaxMin3();
        assertNotNull("Object should be instantiated", maxMin3_0);
    }

}